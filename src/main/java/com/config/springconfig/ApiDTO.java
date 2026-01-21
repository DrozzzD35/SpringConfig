package com.config.springconfig;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ApiDTO {
    private LocalDateTime loadedAt;
    private String name;
    private String contextPath;
    private String port;
    private String url;
    private String version;
    private String description;
    private int timeout;

}
