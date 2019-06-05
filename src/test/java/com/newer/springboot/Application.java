package com.newer.springboot;

import com.newer.springboot.domain.Admins;
import com.newer.springboot.mapper.AdminsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.WebApplicationInitializer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Application  extends SpringBootServletInitializer implements WebApplicationInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


    public static void main(String[] args){
SpringApplication.run(Application.class,args);
    }



}
