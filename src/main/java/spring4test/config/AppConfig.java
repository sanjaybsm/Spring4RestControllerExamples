package spring4test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Sanjay_Shivanna on 5/25/2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "spring4test")
public class AppConfig {

}