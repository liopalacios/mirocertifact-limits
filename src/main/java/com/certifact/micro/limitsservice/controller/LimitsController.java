package com.certifact.micro.limitsservice.controller;

import com.certifact.micro.limitsservice.bean.Limits;
import com.certifact.micro.limitsservice.configuration.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LimitsController {

    private final Configuration configuration;

    @GetMapping("/limit")
    public Limits getLimit() {
        Limits limits = new Limits();
        limits.setMin(configuration.getMinimum());
        limits.setMax(configuration.getMaximum());
        return limits;
    }

}
