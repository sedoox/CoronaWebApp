package de.sedoox.corona.web;

import de.sedoox.corona.web.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class CoronaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoronaApplication.class, args);
    }

}
