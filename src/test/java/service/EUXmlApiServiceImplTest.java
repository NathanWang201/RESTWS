package service;

import domain.NsGame;
import domain.europe.Response;
import mapper.ResponseToNsGameMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class EUXmlApiServiceImplTest {

    EUXmlApiService euXmlApiService;
    RestTemplate restTemplate;
    ResponseToNsGameMapper responseToNsGameMapper;

    @Before
    public void setUp() throws Exception {
        restTemplate = new RestTemplate();
        responseToNsGameMapper = new ResponseToNsGameMapper();
        euXmlApiService = new EUXmlApiServiceImpl(restTemplate);
    }

    @Test
    public void getEUGame() throws JAXBException {
        Response response = euXmlApiService.getEUGame();
        System.out.println(response.getResult().getDoc().size());
        Map<String, NsGame> nsGameMap;
        nsGameMap = responseToNsGameMapper.convert(response);
        assertTrue(response.getResult().getDoc().size() > 0);
        assertTrue(nsGameMap.size() == response.getResult().getDoc().size());
    }
}