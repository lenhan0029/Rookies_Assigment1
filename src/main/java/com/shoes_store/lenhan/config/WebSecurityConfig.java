package com.shoes_store.lenhan.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.nashtech.rookies.security.jwt.JwtAuthEntryPoint;
import com.nashtech.rookies.security.jwt.JwtAuthTokenFilter;
import com.nashtech.rookies.security.jwt.JwtUtils;
import com.nashtech.rookies.security.services.UserDetailsServiceImpl;


@Configuration
@EnableWebSecurity(debug = true)
@EnableGlobalMethodSecurity(
    prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    private final UserDetailsServiceImpl userDetailsService;
//
//    final private JwtAuthEntryPoint unauthorizedHandler;
//
//    private final JwtUtils jwtUtils;
//
//    public WebSecurityConfig (UserDetailsServiceImpl userDetailsService, JwtAuthEntryPoint unauthorizedHandler, JwtUtils jwtUtils) {
//        this.userDetailsService = userDetailsService;
//        this.unauthorizedHandler = unauthorizedHandler;
//        this.jwtUtils = jwtUtils;
//    }
//
//    @Bean
//    public JwtAuthTokenFilter authenticationJwtTokenFilter() {
//        return new JwtAuthTokenFilter(jwtUtils, userDetailsService);
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        // TODO
//        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable()
//            .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//            .authorizeRequests()
//            	.antMatchers("/api/auth/**","/product/**").permitAll()
////            	.antMatchers().permitAll()
//            .anyRequest().authenticated();
//
//        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
//    }
	private final UserDetailsServiceImpl userDetailsService;

    final private JwtAuthEntryPoint unauthorizedHandler;

    private final JwtUtils jwtUtils;

    public WebSecurityConfig (UserDetailsServiceImpl userDetailsService, JwtAuthEntryPoint unauthorizedHandler, JwtUtils jwtUtils) {
        this.userDetailsService = userDetailsService;
        this.unauthorizedHandler = unauthorizedHandler;
        this.jwtUtils = jwtUtils;
    }

    @Bean
    public JwtAuthTokenFilter authenticationJwtTokenFilter() {
        return new JwtAuthTokenFilter(jwtUtils, userDetailsService);
    }

    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        // TODO
        authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
            .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            .authorizeRequests()
            .antMatchers("/product/**").permitAll()
            
//            .antMatchers(HttpMethod.DELETE,"/accounts").hasAuthority("ADMIN")
//            .antMatchers(HttpMethod.GET,"/orders").hasAuthority("ADMIN")
//            .antMatchers(HttpMethod.POST,"/authors").hasAuthority("ADMIN")
//            .antMatchers(HttpMethod.PUT,"/authors/{id}").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.POST,"/books").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.PUT,"/books/{id}").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.DELETE,"/books/{id}").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.POST,"/categories").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.PUT,"/categories/{id}").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.DELETE,"/categories/{id}").hasAuthority("ADMIN")
//        	.antMatchers(HttpMethod.GET,"/orders").hasAuthority("ADMIN")
//            
//        	.antMatchers(HttpMethod.PUT,"/accounts").hasAuthority("Customer")
//        	.antMatchers(HttpMethod.POST,"/orders").hasAuthority("Customer")
//        	.antMatchers("/customers/**").hasAuthority("Customer")
        	
            .anyRequest().authenticated();

        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }
}

