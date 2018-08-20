package service;

import domain.NsGame;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertTrue;

public class PriceUpdateServiceImplTest {
    PriceUpdateService priceUpdateService;

    @Before
    public void setUp() throws Exception {
        priceUpdateService = new PriceUpdateServiceImpl(new RestTemplate());
    }

    @Test
    public void updatePrice() {
        //given
        NsGame nsGame = new NsGame();
        nsGame.setEuNsuid("70010000000023");
        nsGame.setNaNsuid("70010000000025");

        //when
        priceUpdateService.updatePrice(nsGame);

        //then
        assertTrue(nsGame.getGamePrice().getAustraliaPrice() > 0);
        assertTrue(nsGame.getGamePrice().getCanadaPrice() > 0);
        assertTrue(nsGame.getGamePrice().getGreatBritainPrice() > 0);
        assertTrue(nsGame.getGamePrice().getMexicoPrice() > 0);
        assertTrue(nsGame.getGamePrice().getNewZealandPrice() > 0);
        assertTrue(nsGame.getGamePrice().getUsPrice() > 0);
        assertTrue(nsGame.getGamePrice().getCzechPrice() > 0);
        assertTrue(nsGame.getGamePrice().getDenmarkPrice() > 0);
        assertTrue(nsGame.getGamePrice().getRussiaPrice() > 0);
        assertTrue(nsGame.getGamePrice().getEuropePrice() > 0);
        assertTrue(nsGame.getGamePrice().getSouthAfricaPrice() > 0);
    }
}