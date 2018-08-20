package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.NsGame;
import domain.northamerica.NAGame;
import mapper.NAGameToNsGameMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class NARestApiServiceImplTest {
    NARestApiService naRestApiService;
    RestTemplate restTemplate;
    NAGameToNsGameMapper naGameToNsGameMapper;
    String naUrl = "https://www.nintendo.com/json/content/get/filter/game?system=switch&sort=title&direction=asc&shop=ncom&limit=200&offset={offset}";

    @Before
    public void setUp() throws Exception {
        naGameToNsGameMapper = new NAGameToNsGameMapper();
        restTemplate = new RestTemplate();
        naRestApiService = new NARestApiServiceImpl(restTemplate, new ObjectMapper(), naUrl);
    }

    @Test
    public void getNAGame() throws IOException {
        NAGame naGame = naRestApiService.getNAGame();
        System.out.println(naGame.getGames().getGame().size());
        Map<String, NsGame> nsGames = naGameToNsGameMapper.convert(naGame);
        assertTrue(naGame.getGames().getGame().size() > 0);
    }
}