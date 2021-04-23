package io.twinterf.springwithoutbootsetup.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("io.twinterf.springwithoutbootsetup")
public class AppConfig {
}
