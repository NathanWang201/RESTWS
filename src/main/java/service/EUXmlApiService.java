package service;

import domain.europe.Response;

import javax.xml.bind.JAXBException;

public interface EUXmlApiService {
    public Response getEUGame() throws JAXBException;
}
