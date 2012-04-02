package com.jayway.buildnumber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Spring Java configuration used for this application.
 *
 * @author Mattias Severson, Jayway
 */
@Configuration
@EnableWebMvc
public class SpringJavaConfig {

    /**
     * Creates the build number controller.
     * @return A {@link BuildNumberController}.
     */
    @Bean
    public BuildNumberController buildNumberController() {
        return new BuildNumberController();
    }

}
