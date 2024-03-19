//package com.travelblog.Backend.config;
//
//import com.travelblog.Backend.security.JwtAuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//    @Autowired
//    private JwtAuthenticationFilter jwtAuthenticationFilter;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors()
//                .and()
//                .csrf()
//                .disable()
//                .httpBasic()
//                .disable();
////                .sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
////                .and()
////                .authorizeRequests()
////                .antMatchers("/login", "/join","/chat", "/chat/*").permitAll()
////                .anyRequest()
////                .authenticated();
//
//        http.addFilterAfter(jwtAuthenticationFilter, CorsFilter.class);
//    }
//}
