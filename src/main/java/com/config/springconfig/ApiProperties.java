package com.config.springconfig;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "api")
@Data
public class ApiProperties {
    @NotBlank
    private String url;

    @Min(1000)
    @Max(10000)
    private int timeout;

    private String apiKey;

}
