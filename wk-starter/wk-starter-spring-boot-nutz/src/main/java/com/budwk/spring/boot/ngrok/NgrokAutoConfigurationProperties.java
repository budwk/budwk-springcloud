package com.budwk.spring.boot.ngrok;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author kerbores(kerbores@gmail.com)
 *
 */
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
