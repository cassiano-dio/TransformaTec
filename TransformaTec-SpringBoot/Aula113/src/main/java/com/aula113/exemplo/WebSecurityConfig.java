package com.aula113.exemplo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity security) throws Exception{
        security
            .authorizeRequests()
                .antMatchers("/","/home")
                .permitAll().anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
            .and()
                .logout()
                .permitAll();
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService(){
        
        UserDetails user = User.withDefaultPasswordEncoder().username("username").password("password").roles("USER").build();

        System.out.println("---------------------------------------");
        System.out.println("\nUSUÁRIO AUNTENTICADO:\n" + user.getUsername());
        System.out.println("\nUSUÁRIO AUNTENTICADO:\n" + user);
        System.out.println("---------------------------------------");

        return new InMemoryUserDetailsManager(user);

    }
    
}
