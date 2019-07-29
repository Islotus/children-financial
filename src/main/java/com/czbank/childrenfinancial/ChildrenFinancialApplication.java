package com.czbank.childrenfinancial;

import com.czbank.childrenfinancial.swagger.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Import({SwaggerConfiguration.class})
@EnableScheduling
@EnableTransactionManagement
public class ChildrenFinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenFinancialApplication.class, args);
    }


}
