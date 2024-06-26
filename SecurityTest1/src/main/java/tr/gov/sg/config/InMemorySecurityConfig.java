package tr.gov.sg.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//@Configuration
@SuppressWarnings("deprecation")
public class InMemorySecurityConfig {
	// @Bean
	InMemoryUserDetailsManager userDetailsService() {
		UserDetails userDetails = User.withUsername("ali").password("123").build();
		return new InMemoryUserDetailsManager(userDetails);
	}

	// @Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
