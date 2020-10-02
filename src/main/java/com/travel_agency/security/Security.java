//package com.travel_agency.security;
//
//import com.travel_agency.service.UserService;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@AllArgsConstructor
//@EnableWebSecurity
//public class Security extends WebSecurityConfigurerAdapter {
//    @Qualifier("userServiceImpl")
//    private final UserDetailsService userDetailsService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/management/**").hasRole("MANAGEMENT")
//                .anyRequest().authenticated()
//                .and()
//                // We filter the api/login requests
//                // And filter other requests to check the presence of JWT in header
////                .addFilterBefore(new CorsFilter(), UsernamePasswordAuthenticationFilter.class)
//                .addFilterBefore(new RequestProcessingJWTFilter(), UsernamePasswordAuthenticationFilter.class)
//                .addFilterBefore(new LoginFilter("login", authenticationManager(), (UserService) userDetailsService), UsernamePasswordAuthenticationFilter.class);
//    }
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(userDetailsService);
//        provider.setPasswordEncoder(passwordEncoder());
//        return provider;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
////    @Bean
////    CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration configuration = new CorsConfiguration();
////        configuration.setAllowedOrigins(Collections.singletonList("*"));
////        configuration.addAllowedHeader("*");
////        configuration.setAllowedMethods(Arrays.asList(
////                HttpMethod.GET.name(),
////                HttpMethod.HEAD.name(),
////                HttpMethod.POST.name(),
////                HttpMethod.PUT.name(),
////                HttpMethod.DELETE.name(),
////                HttpMethod.OPTIONS.name()));
////        configuration.addExposedHeader("Authorization");
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", configuration);
////        source.registerCorsConfiguration("/", configuration);
////        source.registerCorsConfiguration("/login", configuration);
////        return source;
////    }
//
//}
