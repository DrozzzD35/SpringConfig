package com.config.springconfig;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "app")
@Validated
@RefreshScope
@Data
public class AppProperties {

    @NotBlank
    private String name;

    @NotBlank
    private String version;

    @NotBlank
    private String description;

}
