package com.budwk.spring.boot.ngrok;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author kerbores(kerbores@gmail.com)
 *
 */
@Data
@ConfigurationProperties(prefix = "nutz.ngrok")
public class NgrokAutoConfigurationProperties {

    /**
     * token
     */
    String token;

    /**
     * 代理端口，默认会使用server.port
     */
    int port;
}
