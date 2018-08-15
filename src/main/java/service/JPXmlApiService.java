package service;

import domain.japan.TitleInfoList;

import javax.xml.bind.JAXBException;

public interface JPXmlApiService {
    public TitleInfoList getJPGame() throws JAXBException;
}
