package com.config.springconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

@RestController
public class ConfigController {
    private ApiProperties apiProperties;
    private AppProperties appProperties;

    public ConfigController(ApiProperties apiProperties, AppProperties appProperties) {
        this.apiProperties = apiProperties;
        this.appProperties = appProperties;
    }

    @GetMapping("/config")
    public Map<String, Object> getApiProperties(){
        Map<String, Object> api = new HashMap<>();
        api.put("url", apiProperties.getUrl());
        api.put("timeout", apiProperties.getTimeout());

        return api;
    }




}
