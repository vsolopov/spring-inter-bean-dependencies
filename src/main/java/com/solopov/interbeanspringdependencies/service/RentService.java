package com.solopov.interbeanspringdependencies.service;

public class RentService {

    ExternalService externalService;

    public RentService(ExternalService externalService){
        this.externalService = externalService;
    }

    public ExternalService getExternalService() {
        return externalService;
    }

    public void rentCar(){}

    public void rentApartment(){}

}
