package com.bahaa.microservices.limitsservice.controller;

import com.bahaa.microservices.limitsservice.bean.Limit;
import com.bahaa.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    Configuration configuration;
    @GetMapping("/limits")
    public Limit getLimits(){
        return new Limit(configuration.getMinimum(), configuration.getMaximum());
    }
}
