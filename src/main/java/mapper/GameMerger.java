package mapper;

import domain.NsGame;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GameMerger {

    public Map<String, NsGame> merge(Map<String, NsGame> namap, Map<String, NsGame> eumap){
        Map<String, NsGame> mergedMap = new HashMap<>();

        namap.forEach((k, v) -> {
            NsGame nsGame = new NsGame();
            nsGame.setNaTitle(v.getNaTitle());
            nsGame.setNaNsuid(v.getNaNsuid());
            nsGame.setBoxArtUrl(v.getBoxArtUrl());
            nsGame.setMetaName(v.getMetaName());
            nsGame.setDigital(v.isDigital());
            if(eumap.containsKey(k)){
                nsGame.setPublisher(eumap.get(k).getPublisher());
                nsGame.setDescription(eumap.get(k).getDescription());
                nsGame.setAge_rating(eumap.get(k).getAge_rating());
                nsGame.setReleaseDate(eumap.get(k).getReleaseDate());
                nsGame.setEuNsuid(eumap.get(k).getEuNsuid());
                nsGame.setLanguages(eumap.get(k).getLanguages());
                nsGame.setTvMode(eumap.get(k).isTvMode());
                nsGame.setHandMode(eumap.get(k).isHandMode());
            }else{
                nsGame.setReleaseDate(v.getReleaseDate());
                nsGame.setDigital(v.isDigital());
            }
            mergedMap.put(k, nsGame);
        });
        eumap.forEach((k,v) -> {
            NsGame nsGame = new NsGame();
            if(!namap.containsKey(k)){
                nsGame.setPublisher(v.getPublisher());
                nsGame.setDescription(v.getDescription());
                nsGame.setAge_rating(v.getAge_rating());
                nsGame.setReleaseDate(v.getReleaseDate());
                nsGame.setEuNsuid(v.getEuNsuid());
                nsGame.setLanguages(v.getLanguages());
                nsGame.setTvMode(v.isTvMode());
                nsGame.setHandMode(v.isHandMode());
                nsGame.setEuTitle(v.getEuTitle());
                nsGame.setImgURL(v.getImgURL());
                nsGame.setBoxArtUrl(v.getBoxArtUrl());
            }
            mergedMap.put(k, nsGame);
        });
        return mergedMap;
    }
}
