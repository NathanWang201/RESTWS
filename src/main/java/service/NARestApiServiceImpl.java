package service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.northamerica.NAGame;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class NARestApiServiceImpl implements NARestApiService{

    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private String url;

    public NARestApiServiceImpl(RestTemplate restTemplate, ObjectMapper objectMapper, @Value("${spring.api.na-url}") String url) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
        this.url = url;
        System.out.println("url = " + url);
    }

    @Override
    public NAGame getNAGame() throws IOException {
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
        String first200 = restTemplate.getForObject(url, String.class, 0);
        NAGame naGame = objectMapper.readValue(first200, NAGame.class);
        for(int offset=200; offset <= 600; offset=offset+200){
            String naGameJson = restTemplate.getForObject(url, String.class, offset);
            NAGame naGameWithOffset = objectMapper.readValue(naGameJson, NAGame.class);
            naGame.getGames().getGame().addAll(naGameWithOffset.getGames().getGame());
        }
        return naGame;
    }
}
