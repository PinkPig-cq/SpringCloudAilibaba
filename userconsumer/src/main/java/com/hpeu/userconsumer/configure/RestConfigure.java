package com.hpeu.userconsumer.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfigure {
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
