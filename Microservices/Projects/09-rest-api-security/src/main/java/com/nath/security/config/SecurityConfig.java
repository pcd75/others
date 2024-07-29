package com.nath.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
//	@Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web) -> web.ignoring().requestMatchers("/home", "/contact");
//    }
	
	 @Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	            .authorizeHttpRequests((authz) -> authz
	                .requestMatchers("/balance").authenticated()
	                .requestMatchers("/statement").authenticated()
	                .requestMatchers("/myLoan").authenticated()
	                .requestMatchers("/home").permitAll()
	                .requestMatchers("/contact").permitAll()         
	            );
	        http
			.formLogin(form -> form
				.permitAll());
	        return http.build();
	    }
	 
	 @Bean
	 public UserDetailsService users() {
	 	// The builder will ensure the passwords are encoded before saving in memory
	 	UserBuilder users = User.withDefaultPasswordEncoder();
	 	UserDetails user = users
	 		.username("adi")
	 		.password("adi@123")
	 		.roles("user")
	 		.build();
	 	UserDetails admin = users
	 		.username("nath")
	 		.password("nath@123")
	 		.roles("admin")
	 		.build();
	 	return new InMemoryUserDetailsManager(user, admin);
	 }
	 
	 
}
