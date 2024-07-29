package com.nath.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http)throws Exception{

        http.authorizeRequests(requests -> requests
                .antMatchers("/balance").authenticated()
                .antMatchers("/statement").authenticated()
                .antMatchers("/myLoan").authenticated()
                .antMatchers("/contact").permitAll()
                .antMatchers("/home").permitAll()).formLogin(withDefaults()).httpBasic(withDefaults());
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("adi").password("adi@123").authorities("admin")
			.and()
			.withUser("nath").password("nath@123").authorities("read")
			.and()
			.withUser("asd").password("asd@123").authorities("read")
			.and()
			.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
}
