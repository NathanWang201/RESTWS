package controller;

import domain.NsGame;
import domain.europe.Response;
import domain.northamerica.NAGame;
import mapper.GameMerger;
import mapper.NAGameToNsGameMapper;
import mapper.ResponseToNsGameMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import service.*;

import javax.transaction.Transactional;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class ScheduledGameRetrievalController {
    private final EUXmlApiService euXmlApiService;
    private final JPXmlApiService jpXmlApiService;
    private final NARestApiService naRestApiService;
    private final MetaScoreService metaScoreService;
    private final NAGameToNsGameMapper naGameToNsGameMapper;
    private final ResponseToNsGameMapper responseToNsGameMapper;
    private final PriceUpdateService priceUpdateService;
    private final GameMerger merger;
    private final NsGameService nsGameService;

    public ScheduledGameRetrievalController(EUXmlApiService euXmlApiService, JPXmlApiService jpXmlApiService, NARestApiService naRestApiService, MetaScoreService metaScoreService, NAGameToNsGameMapper naGameToNsGameMapper, ResponseToNsGameMapper responseToNsGameMapper, PriceUpdateService priceUpdateService, GameMerger merger, NsGameService nsGameService) {
        this.euXmlApiService = euXmlApiService;
        this.jpXmlApiService = jpXmlApiService;
        this.naRestApiService = naRestApiService;
        this.metaScoreService = metaScoreService;
        this.naGameToNsGameMapper = naGameToNsGameMapper;
        this.responseToNsGameMapper = responseToNsGameMapper;
        this.priceUpdateService = priceUpdateService;
        this.merger = merger;
        this.nsGameService = nsGameService;
    }

    @Scheduled(fixedDelay = 100000)
    @Transactional
    public void updateGameData() {
        Response response;
        NAGame naGame;
        Map<String, NsGame> nsGameNA;
        Map<String, NsGame> nsGameEU;
        Map<String, NsGame> mergedMap;
        List<NsGame> nsGameList;
        try{
            response = euXmlApiService.getEUGame();
            naGame = naRestApiService.getNAGame();
            nsGameNA = naGameToNsGameMapper.convert(naGame);
            nsGameEU = responseToNsGameMapper.convert(response);
            mergedMap = merger.merge(nsGameNA, nsGameEU);
            mergedMap.forEach((k,v) ->{
                try {
                    metaScoreService.updateScore(v);
                    priceUpdateService.updatePrice(v);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            nsGameList = mergedMap.values().stream().collect(Collectors.toList());
            nsGameService.saveAll(nsGameList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}
