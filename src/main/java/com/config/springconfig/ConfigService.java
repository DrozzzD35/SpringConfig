package com.config.springconfig;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ConfigService {

    private static final Logger log = LoggerFactory.getLogger(ConfigService.class);

    private final ApiProperties api;
    private final AppProperties app;
    private LocalDateTime loadedAt;

    public ConfigService(ApiProperties apiProperties, AppProperties appProperties) {
        this.api = apiProperties;
        this.app = appProperties;
    }

    @PostConstruct
    public void init(){
        log.info("Урааааааааааааааааааааа!!!!!!");
        log.debug("Дебаааааааааг ===============");
        log.warn("warn ");
        log.error("Ошиииииибаа??????");
        this.loadedAt = LocalDateTime.now();
    }

    public ApiDTO getConfig() {

        ApiDTO apiDTO = ApiDTO.builder()
                .name(app.getName())
//                .Path()
//                .port()
                .url(api.getUrl())
                .version(app.getVersion())
                .description(app.getDescription())
                .timeout(api.getTimeout())
                .loadedAt(loadedAt)
                .build();

        return apiDTO;

    }

}
