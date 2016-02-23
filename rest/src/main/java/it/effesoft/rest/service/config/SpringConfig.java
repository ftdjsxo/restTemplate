package it.effesoft.rest.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("it.effesoft")
@EnableWebMvc
public class SpringConfig {

}
