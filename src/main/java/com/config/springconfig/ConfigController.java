package com.config.springconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {
    private ApiProperties apiProperties;
    private AppProperties appProperties;

    public ConfigController(ApiProperties apiProperties, AppProperties appProperties) {
        this.apiProperties = apiProperties;
        this.appProperties = appProperties;
    }

    @GetMapping("/config/api")
    public Map<String, Object> getApiProperties() {
        Map<String, Object> api = new HashMap<>();
        api.put("url", apiProperties.getUrl());
        api.put("timeout", apiProperties.getTimeout());

        return api;
    }

    @GetMapping("/config/app")
    public Map<String, Object> getAppProperties() {
        Map<String, Object> app = new HashMap<>();
        app.put("name", appProperties.getName());
        app.put("version", appProperties.getVersion());
        app.put("description", appProperties.getDescription());

        return app;
    }

    @GetMapping("/config")
    public Map<String, Object> getConfigs() {
        Map<String, Object> configs = new HashMap<>();
        configs.put("appProperties", getAppProperties());
        configs.put("apiProperties", getApiProperties());

        return configs;
    }


}
