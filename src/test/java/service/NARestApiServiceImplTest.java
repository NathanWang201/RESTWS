package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.northamerica.NAGame;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.junit.Assert.*;

public class NARestApiServiceImplTest {
    NARestApiService naRestApiService;
    RestTemplate restTemplate;
    String naUrl = "https://www.nintendo.com/json/content/get/filter/game?system=switch&sort=title&direction=asc&shop=ncom&limit=200&offset={offset}";

    @Before
    public void setUp() throws Exception {
        restTemplate = new RestTemplate();
        naRestApiService = new NARestApiServiceImpl(restTemplate, new ObjectMapper(), naUrl);
    }

    @Test
    public void getNAGame() throws IOException {
        NAGame naGame = naRestApiService.getNAGame();
        System.out.println(naGame.getGames().getGame().size());
        assertTrue(naGame.getGames().getGame().size() > 0);
    }
}