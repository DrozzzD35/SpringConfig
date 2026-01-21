package com.config.springconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigController {
    private ApiDTO api;
    private AppProperties app;

    public ConfigController(ApiDTO api, AppProperties app) {
        this.api = api;
        this.app = app;
    }

    @GetMapping("/config")
    public Map<String, Object> getProperties() {
        Map<String, Object> properties = new HashMap<>();
        properties.put("api", api);
        properties.put("app", app);
        return properties;
    }

}
