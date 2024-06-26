package tr.gov.sg.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

//@SuppressWarnings("deprecation")
@Configuration
public class SecurityConfig {
	@Bean
	UserDetailsManager userDetailsManager() {
		List<UserDetails> users = new ArrayList<UserDetails>();
		UserDetails user = User.withUsername("ali")
				.password("$2a$10$MGZCqPSYy61ie2e40zc43OA3IoJUMSAuRB8bMJwKy83Q4BwL8WqyK").roles("USER", "ADMIN")
				.build();
		users.add(user);
		// şifre: 123
		return new InMemoryUserDetailsManager(users);
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		// return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode("123");
		System.out.println(encodedPassword);
		String encodedPassword2 = passwordEncoder.encode("123");
		System.out.println(encodedPassword2);
		System.out.println(
				passwordEncoder.matches("1234", "$2a$10$MGZCqPSYy61ie2e40zc43OA3IoJUMSAuRB8bMJwKy83Q4BwL8WqyK"));
		System.out.println(
				passwordEncoder.matches("123", "$2a$10$BtpDXKCgkleHVlRKAJcrDOm0Erx4R5TF2YESeLWS68Yuk2A6Op38W"));

	}
}
