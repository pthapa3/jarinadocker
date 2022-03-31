package com.springbootdockergradle.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        // you might get Deprecated warning
        // for clear text password
        return NoOpPasswordEncoder.getInstance();
    }

    // Authentication
    // There are a bunch of out of the box authentication implementation
    // For example ldap, jdbc. But does not have for JPA.
    // auth.ldapAuthentication()
    // auth.jdbcAuthentication()
    // AuthenticationManager talks to AuthenticationProvider which then talks to UserDetailsService
    // (you create the UserDetailsService)
    // which then look up the user in the DB using JPA
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println("Authenticaion");

    }


    // Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        System.out.println("Authorizing");
        http.authorizeRequests()
                .antMatchers("/demo").permitAll()
                .and().formLogin();
    }

}
