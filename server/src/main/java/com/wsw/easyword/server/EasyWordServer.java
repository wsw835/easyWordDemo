package com.wsw.easyword.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author wensw
 */
@SpringBootApplication(scanBasePackages = {"com.wsw.easyword"})
public class EasyWordServer {

    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(EasyWordServer.class, args);
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        EasyWordServer.applicationContext = applicationContext;
    }
}
