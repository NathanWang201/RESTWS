package service;

import domain.NsGame;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MetaScoreServiceImpl implements MetaScoreService{
    @Override
    public void updateScore(NsGame nsGame) throws IOException {
        String url = "http://www.metacritic.com/game/switch/" + nsGame.getMetaName();
        Document doc = Jsoup.connect(url).userAgent("Chrome").get();
//        System.out.println(doc.toString());
        Elements divs = doc.select("div");
        if(divs != null){
            Element userScore  = divs.stream().filter(element -> element.attr("class").equals("metascore_w user large game positive")).findFirst().get();
            Element criticScoreDiv  = divs.stream().filter(element -> element.attr("class").equals("metascore_w xlarge game positive")).findFirst().get();

            nsGame.setMetaCriticScore(Integer.parseInt(((TextNode)criticScoreDiv.child(1).childNode(0)).text()));
            nsGame.setMetaUserScore(Float.parseFloat(((TextNode)userScore.childNode(0)).text()));
        }
    }
}
