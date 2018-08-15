package service;

import domain.japan.TitleInfoList;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;

import static org.junit.Assert.*;

public class JPXmlApiServiceImplTest {

    JPXmlApiService jpXmlApiService;
    RestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        restTemplate = new RestTemplate();
        jpXmlApiService = new JPXmlApiServiceImpl(restTemplate);
    }

    @Test
    public void getJPGame() throws JAXBException {
        TitleInfoList jpGame = jpXmlApiService.getJPGame();
        assertTrue(jpGame.getTitleInfo().size() > 0);
    }
}