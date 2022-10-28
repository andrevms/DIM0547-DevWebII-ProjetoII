package com.projetounidade2.projetorestapisecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests((authz) -> {
                try {
                    authz
                        .antMatchers("/api/**").permitAll();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        return http.build();
    }
}
