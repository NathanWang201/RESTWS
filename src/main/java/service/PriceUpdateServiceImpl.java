package service;

import domain.GamePrice;
import domain.NsGame;
import dto.Price;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class PriceUpdateServiceImpl implements PriceUpdateService{
    private RestTemplate restTemplate;

    public PriceUpdateServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public NsGame updatePrice(NsGame nsGame) {
        GamePrice gamePrice;
        Price usPrice;
        Price mexicoPrice;
        Price canadaPrice;
        Price japanPrice;
        Price auPrice;
        Price nzPrice;
        Price ukPrice;
        Price ruPrice;
        Price czPrice;
        Price euPrice;
        Price zaPrice;
        Price dkPrice;
        Price steamPrice;
        Price xboxPrice;
        Price gogPrice;
        String url = "https://api.ec.nintendo.com/v1/price?country={country}&lang=en&ids={id}";

        usPrice = restTemplate.getForObject(url, Price.class,"US", nsGame.getNaNsuid());
        mexicoPrice = restTemplate.getForObject(url, Price.class,"MX", nsGame.getNaNsuid());
        canadaPrice = restTemplate.getForObject(url, Price.class,"CA", nsGame.getNaNsuid());
        japanPrice = restTemplate.getForObject(url, Price.class,"US", nsGame.getNaNsuid());
        auPrice = restTemplate.getForObject(url, Price.class,"AU", nsGame.getEuNsuid());
        nzPrice = restTemplate.getForObject(url, Price.class,"NZ", nsGame.getEuNsuid());
        ukPrice = restTemplate.getForObject(url, Price.class,"GB", nsGame.getEuNsuid());
        ruPrice = restTemplate.getForObject(url, Price.class,"RU", nsGame.getEuNsuid());
        czPrice = restTemplate.getForObject(url, Price.class,"CZ", nsGame.getEuNsuid());
        euPrice = restTemplate.getForObject(url, Price.class,"FR", nsGame.getEuNsuid());
        zaPrice = restTemplate.getForObject(url, Price.class,"ZA", nsGame.getEuNsuid());
        dkPrice = restTemplate.getForObject(url, Price.class,"DK", nsGame.getEuNsuid());

        gamePrice = new GamePrice(extractRawPrice(usPrice),
                extractRawPrice(mexicoPrice),
                extractRawPrice(canadaPrice),
                0.0f,
                extractRawPrice(auPrice),
                extractRawPrice(nzPrice),
                extractRawPrice(ukPrice),
                extractRawPrice(ruPrice),
                extractRawPrice(czPrice),
                extractRawPrice(euPrice),
                extractRawPrice(zaPrice),
                extractRawPrice(dkPrice),
                0.0f,
                0.0f,
                0.0f,
                nsGame);
        nsGame.setGamePrice(gamePrice);
        return nsGame;
    }

    private float extractRawPrice(Price price){
        float rawPrice = 0.0f;
        return Float.parseFloat(((ArrayList<LinkedHashMap<String, LinkedHashMap<String,String>>>)price.getAdditionalProperties().get("prices")).get(0).get("regular_price").get("raw_value"));
    }
}
