package com.dftcmedia.tckk.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * <p>DESC:天呈快快--微服务--服务注册中心 </p>
 * <p>DATE: 2019/1/30</p>
 * <p>VERSION:1.0.0</p>
 * <p>@AUTHOR: DengC</p>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}

