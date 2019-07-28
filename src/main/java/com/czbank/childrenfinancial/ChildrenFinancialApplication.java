package com.czbank.childrenfinancial;

import com.czbank.childrenfinancial.swagger.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SwaggerConfiguration.class})
public class ChildrenFinancialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenFinancialApplication.class, args);
    }

}
