package com.inspur.configeurekaclient;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 此种方式update无效！！！
@Data
@Component
public class GitConfig {
    @Value("${data.env}")
    private String env;
    @Value("${data.user.username}")
    private String username;
    @Value("${data.user.password}")
    private String password;
}
