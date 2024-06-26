package tr.gov.sg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Autowired
	private DataSource dataSource;

	@Bean
	UserDetailsManager userDetailsManager() {
		JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
		manager.setUsersByUsernameQuery("select username, password, enabled from users where username=? and enabled=1");
		manager.setAuthoritiesByUsernameQuery("select * from authorities where username=?");
		return manager;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		//@formatter:off
	    return http.authorizeHttpRequests(request -> request
	               .requestMatchers("/", "/index.html").hasRole("USER")
	               .requestMatchers("/menu.html").hasRole("ADMIN")
	               .anyRequest()
	               .authenticated())
	           .formLogin(Customizer.withDefaults())
	           .build();
	    //@formatter:on
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
