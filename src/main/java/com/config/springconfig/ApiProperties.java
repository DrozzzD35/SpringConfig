package com.config.springconfig;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix = "api")
@Validated
@Data
@RefreshScope
public class ApiProperties {
    @NotBlank
    private String url;

    @Min(value = 1000, message = "Минимальный 1000мс")
    @Max(value = 10000, message = "Максимальный 10000мс")
    private int timeout;

    @NotBlank(message = "API ключ обязательный")
    private String apiKey;

}
