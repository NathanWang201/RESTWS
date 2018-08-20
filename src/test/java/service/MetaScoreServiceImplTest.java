package service;

import domain.NsGame;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class MetaScoreServiceImplTest {
    MetaScoreService metaScoreService;

    @Before
    public void setUp() throws Exception {
        metaScoreService = new MetaScoreServiceImpl();
    }

    @Test
    public void updateScore() throws IOException {
        //given
        NsGame nsGame = new NsGame();
        nsGame.setMetaName("hollow-knight");

        //when
        metaScoreService.updateScore(nsGame);
        int criticScore = nsGame.getMetaCriticScore();
        float userScore = nsGame.getMetaUserScore();

        System.out.println(criticScore + "  " + userScore);

        //then
        assertTrue(criticScore > 0 & criticScore <= 100);
        assertTrue(userScore > 0 & userScore <= 10);
    }
}