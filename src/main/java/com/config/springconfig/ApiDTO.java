package com.config.springconfig;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ApiDTO {
    private String url;
    private int timeout;

    public ApiDTO(ApiProperties api) {
        this.url = api.getUrl();
        this.timeout = api.getTimeout();
    }
}
