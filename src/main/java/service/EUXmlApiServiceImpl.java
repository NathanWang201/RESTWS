package service;

import domain.europe.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Service
public class EUXmlApiServiceImpl implements EUXmlApiService{

    private RestTemplate restTemplate;

    public EUXmlApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response getEUGame() throws JAXBException {
        String euGameStr = restTemplate.getForObject("http://search.nintendo-europe.com/en/select?fq=type:GAME AND system_type:nintendoswitch* AND product_code_txt:*&q=*&sort=sorting_title asc&wt=xml&rows=9999&start=0", String.class);
        JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(euGameStr);
        Response response = (Response) unmarshaller.unmarshal(reader);

        return response;
    }
}
