package com.aula114.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //Autenticação de usuário
    @Bean
    @Override
    protected UserDetailsService userDetailsService(){

        // Senha criptografada: superpassword
        UserDetails user = User
                            .withUsername("user")
                            .password("$2a$10$e3f.orRvuyNraHES9Nr2Ye0vtPvqzcgyIxIXLQV2Cu3cWv0EYdMjG")
                            .roles("USER")
                            .build();

        UserDetails admin = User
                            .withUsername("admin")
                            .password("$2a$10$e3f.orRvuyNraHES9Nr2Ye0vtPvqzcgyIxIXLQV2Cu3cWv0EYdMjG")
                            .roles("ADMIN")
                            .build();
                            
        return new InMemoryUserDetailsManager(user, admin);
    }

    //Autorização de usuários
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().antMatchers("/", "/home").permitAll()
        .mvcMatchers("/cpanel").hasRole("ADMIN")
        .anyRequest().authenticated()
        .and()
        .formLogin()
            .loginPage("/login")		
            .usernameParameter("u").passwordParameter("p")				
            .permitAll()
            .failureUrl("/loginerror")
            .defaultSuccessUrl("/loginsuccess")
            .and()
        .logout().permitAll()
        .logoutSuccessUrl("/logoutsuccess")
        .and()
        .exceptionHandling().accessDeniedPage("/403");
    }
    
}
