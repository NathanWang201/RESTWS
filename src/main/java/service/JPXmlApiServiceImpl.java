package service;

import domain.japan.TitleInfoList;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Service
public class JPXmlApiServiceImpl implements JPXmlApiService{

    RestTemplate restTemplate;

    public JPXmlApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public TitleInfoList getJPGame() throws JAXBException {
        String titleInfoListStr = restTemplate.getForObject("https://www.nintendo.co.jp/data/software/xml/switch.xml", String.class);
        JAXBContext jaxbContext = JAXBContext.newInstance(TitleInfoList.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(titleInfoListStr);
        TitleInfoList titleInfoList = (TitleInfoList) unmarshaller.unmarshal(reader);
//        System.out.println(titleInfoList);

        return titleInfoList;
    }
}
