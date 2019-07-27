package com.czbank.childrenfinancial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ChildrenFinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenFinancialApplication.class, args);
    }


}
