package mapper;


import domain.NsGame;
import domain.northamerica.NAGame;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Component
public class NAGameToNsGameMapper {

    public Map<String, NsGame> convert(NAGame naGame){
        Map<String, NsGame> nsGameMap = new HashMap<>();

        naGame.getGames().getGame().forEach(game -> {
            NsGame nsGame = new NsGame();
            String gameCode = game.getGameCode();
            nsGame.setNaNsuid(game.getNsuid());
            nsGame.setNaTitle(game.getTitle());
            nsGame.setBoxArtUrl(game.getFrontBoxArt());
            nsGame.setMetaName(game.getSlug().replace("-switch",""));
//            nsGame.setPlayerNum(Integer.parseInt(game.getNumberOfPlayers()));
            nsGame.setDigital(Boolean.parseBoolean(game.getDigitaldownload()));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
            nsGame.setReleaseDate(LocalDate.parse(game.getReleaseDate(), formatter));
            nsGame.setDigital(Boolean.parseBoolean(game.getDigitaldownload()));
            nsGameMap.put(gameCode, nsGame);
        });

        return nsGameMap;
    }

}
