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

    @Min(value = 1000, message = "Минимальный 1000мс")
    @Max(value = 10000, message = "Максимальный 10000мс")
    private int timeout;

    @NotBlank(message = "API ключ обязательный")
    private String apiKey;

}
