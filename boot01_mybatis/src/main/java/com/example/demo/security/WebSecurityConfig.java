package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	PasswordEncoder passwordEncoder() {   // 암호화
		return new BCryptPasswordEncoder(15);
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((requests) -> requests
				.requestMatchers("/", "/home", "/css/*", "/js/*", "/assets/*").permitAll()
				.requestMatchers("/admin/*","/empMain").hasRole("ADMIN")
				.anyRequest().authenticated()
			)
			.formLogin((form) -> form.permitAll()
					         .loginPage("/login")
					         .usernameParameter("username")
					         .successForwardUrl("/board"))
			.logout((logout) -> logout.deleteCookies("JSESSIONID").permitAll())
			.csrf(csrf -> csrf.disable())
//			.csrf((csrf) -> csrf.ignoringRequestMatchers("/api/*")   );
			;

		return http.build();
	}

  //메모리 기반으로 인증
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("1111")
//				.roles("USER")
//				.build();
//		UserDetails admin =
//				 User.withDefaultPasswordEncoder()
//					.username("admin")
//					.password("1111")
//					.roles("ADMIN")
//					.build();
//
//		return new InMemoryUserDetailsManager(user,admin);
//	}
}
