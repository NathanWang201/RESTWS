package service;


import domain.northamerica.NAGame;

import java.io.IOException;

public interface NARestApiService {
    NAGame getNAGame() throws IOException;
}
