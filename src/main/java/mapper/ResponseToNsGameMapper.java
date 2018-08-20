package mapper;

import domain.NsGame;
import domain.europe.Response;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ResponseToNsGameMapper {

    public Map<String, NsGame> convert(Response response){
        Map<String, NsGame> nsGameMap = new HashMap();
        List<Response.Result.Doc> docs = response.getResult().getDoc();
        docs.forEach(doc -> {
            NsGame nsGame = new NsGame();
            List<Object> objects = doc.getStrOrDateOrArr();
            objects.forEach(o -> {
                if(o instanceof Response.Result.Doc.Str){
                    switch (((Response.Result.Doc.Str) o).getName()){
                        case "publisher":
                            nsGame.setPublisher(((Response.Result.Doc.Str) o).getValue());
                            break;
                        case "excerpt":
                            nsGame.setDescription(((Response.Result.Doc.Str) o).getValue());
                            break;
                        case "age_rating_value":
                            nsGame.setAge_rating(((Response.Result.Doc.Str) o).getValue());
                            break;
                        case "dates_released_dts":
                            nsGame.setReleaseDate(LocalDate.parse(((Response.Result.Doc.Str) o).getValue()));
                            break;
                        case "image_url_sq_s":
                            nsGame.setImgURL(((Response.Result.Doc.Str) o).getValue().substring(2));
                            break;
                        case "image_url":
                            nsGame.setBoxArtUrl(((Response.Result.Doc.Str) o).getValue().substring(2));
                            break;
                        case "title":
                            nsGame.setEuTitle(((Response.Result.Doc.Str) o).getValue());
                            break;
                        default:
                            break;
                    }
                }else if(o instanceof Response.Result.Doc.Arr){
                    switch (((Response.Result.Doc.Arr) o).getName()){
                        case "product_code_txt":
                            nsGame.setGameCode(((Response.Result.Doc.Arr) o).getStr().get(0));
                            break;
                        case "nsuid_txt":
                            nsGame.setEuNsuid(((Response.Result.Doc.Arr) o).getStr().get(0));
                            break;
                        case "language_availability":
                            nsGame.setLanguages(((Response.Result.Doc.Arr) o).getStr().get(0));
                            break;
                        default:
                            break;
                    }
                }else if(o instanceof Response.Result.Doc.Date){

                }else if(o instanceof Response.Result.Doc.Bool){
                    switch (((Response.Result.Doc.Bool) o).getName()){
                        case "play_mode_tv_mode_b":
                            nsGame.setTvMode(Boolean.parseBoolean(((Response.Result.Doc.Bool) o).getContent().get(0)));
                            break;
                        case "play_mode_handheld_mode_b":
                            nsGame.setHandMode(Boolean.parseBoolean(((Response.Result.Doc.Bool) o).getContent().get(0)));
                            break;
                        case "digital_version_b":
                            nsGame.setDigital(Boolean.parseBoolean(((Response.Result.Doc.Bool) o).getContent().get(0)));
                            break;
                        default:
                            break;
                    }
                }
            });
            nsGameMap.put(nsGame.getGameCode(), nsGame);
        });
        return nsGameMap;
    }
}
