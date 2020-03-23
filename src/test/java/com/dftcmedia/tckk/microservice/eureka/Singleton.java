package com.dftcmedia.tckk.microservice.eureka;

public enum  Singleton {
    INSTANCE;
    public Singleton getInstance(){
        return INSTANCE;
    }
}