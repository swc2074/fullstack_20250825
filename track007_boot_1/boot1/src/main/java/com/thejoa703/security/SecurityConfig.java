package com.thejoa703.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http /* 1. 허용경로 */
		.authorizeHttpRequests(auth -> auth
					//누구나다 접근가능
					.antMatchers("/users/join", " /users/login", "/users/idddouble").permitAll()
					//로그인한 유저들만 접근가능
					.antMatchers("/users/mypage","/users/update","/users/delete").authenticated()
					//그외 요청은 모두 허용
					.anyRequest().permitAll()
				)
		
		
		/* 2. 로그인처리 */
		.formLogin( form -> form
				.loginPage("/user/login") // <- 로그인폼
				.loginProcessingUrl("/users/loginProc") // <-로고인 경로
				.defaultSuccessUrl("/users/mypage", true)// 로고인 성공시 경로
				.failureUrl("/users/fail") // 로그인 실패시 경로
				.permitAll()
				
				
				)
		/* 3. 로그아웃 */
		.logout( logout -> logout
				.logoutRequestMatcher(new AntPathRequestMatcher("/users/logout"))
				.logoutSuccessUrl("/users/login")
				.invalidateHttpSession(true)
				.permitAll()
				
				
				)
		/* 4. csrf 예외처리 */	
		.csrf( csrf -> csrf.ignoringAntMatchers("/users/join" , "/users/update", "/users/delete"));
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration  authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}
}
