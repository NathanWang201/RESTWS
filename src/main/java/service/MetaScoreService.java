package service;

import domain.NsGame;

import java.io.IOException;

public interface MetaScoreService {
    public void updateScore(NsGame nsGame) throws IOException;
}
