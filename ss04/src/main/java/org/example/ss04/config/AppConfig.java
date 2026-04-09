package org.example.ss04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.example.ss04")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setSuffix("/views");
        view.setSuffix(".jsp");
        return viewResolver();
    }
}
