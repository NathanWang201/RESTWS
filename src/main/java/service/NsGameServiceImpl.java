package service;

import domain.NsGame;
import org.springframework.stereotype.Service;
import repository.GamePriceRepository;
import repository.NsGameRepository;

import java.util.List;

@Service
public class NsGameServiceImpl implements NsGameService{
    NsGameRepository nsGameRepository;
    GamePriceRepository gamePriceRepository;

    public NsGameServiceImpl(NsGameRepository nsGameRepository, GamePriceRepository gamePriceRepository) {
        this.nsGameRepository = nsGameRepository;
        this.gamePriceRepository = gamePriceRepository;
    }

    @Override
    public void saveAll(List<NsGame> nsGames) {
        nsGameRepository.saveAll(nsGames);
    }
}
