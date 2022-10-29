package com.projetounidade2.projetorestapisecurity.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.OncePerRequestFilter;

import com.projetounidade2.projetorestapisecurity.security.JwtAuthFilter;
import com.projetounidade2.projetorestapisecurity.security.JwtService;
import com.projetounidade2.projetorestapisecurity.service.impl.UsuarioServiceImpl;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    
    @Autowired
    private JwtService jwtService;

    @Autowired
    private UsuarioServiceImpl usuarioService;

    @Bean
    public OncePerRequestFilter jwtFilter(){
        return new JwtAuthFilter(jwtService, usuarioService);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests((authz) -> {
                try {
                    authz
                        .antMatchers("/api/**").permitAll()
                        .and()
                            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        return http.build();
    }
}
