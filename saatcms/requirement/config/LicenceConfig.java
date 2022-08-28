package com.example.saatcms.requirement.config;

import com.example.saatcms.requirement.repository.LicenceRepository;
import com.example.saatcms.requirement.main.Licence;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class LicenceConfig {
    /*
    @Bean
    CommandLineRunner commandLineRunner (LicenceRepository repository){
        return args -> {
            Licence bayar = new Licence(
                    "Bayar",
                    LocalDate.of(2021, 8, 23),
                    LocalDate.of(2022, 8, 23)
            );
            Licence yılmaz = new Licence(
                    "Yılmaz",
                    LocalDate.of(2020, 6, 25),
                    LocalDate.of(2022, 6, 25)
            );
            repository.saveAll(
                    List.of(bayar, yılmaz)
            );
        };
    }
    */
}
