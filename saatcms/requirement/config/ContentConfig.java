package com.example.saatcms.requirement.config;

import com.example.saatcms.requirement.repository.ContentRepository;
import com.example.saatcms.requirement.main.Content;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ContentConfig {
    /*
    @Bean
    CommandLineRunner commandLineRunner (ContentRepository repository){
        return args -> {
          Content hasan = new Content(
                    "Hasan",
                    "user",
                    "httpwwwexamplecomxyzhtml",
                    "/xyz.html"
          );

          Content ozgur = new Content(
                    "Ozgur",
                    "learner",
                    "http//www.example12com/xyzhtml",
                    "/xyv.html"
          );
          repository.saveAll(
                    List.of(hasan, ozgur)
          );
        };
    }
    */

}
