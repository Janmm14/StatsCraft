/*
 * Copyright (c) 2016 StatsCraft Authors and Contributors.
 */

package org.statscraft;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * The security aspect of Spring.
 * <p>
 * This is a really cool feature of Spring.
 * We can eventually set it so that a certain content root (i.e. /user/*) is protected by authentication,
 * and it will automatically show the login form if the user is not logged in.
 *
 * @author SirFaizdat
 */
@EnableWebSecurity public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // TODO This currently permits all connections to use all pages, regardless of the role
    // Use this guide to configure this to require role USER for authentication-requiring pages.
    // http://docs.spring.io/spring-security/site/docs/current/guides/html5//helloworld-boot.html
    @Override protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll();
    }

}
