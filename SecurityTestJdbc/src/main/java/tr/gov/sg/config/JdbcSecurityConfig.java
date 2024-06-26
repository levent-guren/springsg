package tr.gov.sg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@SuppressWarnings("deprecation")
public class JdbcSecurityConfig {
	@Autowired
	private DataSource dataSource;

	@Autowired
	void userDetailsService(AuthenticationManagerBuilder auth) throws Exception {
		// @formatter:off
		auth.jdbcAuthentication()
		        .dataSource(dataSource)
		        .passwordEncoder(NoOpPasswordEncoder.getInstance());
				//.usersByUsernameQuery("select * from users where username=?")
				//.authoritiesByUsernameQuery("select * from authorities where username=?");
		// @formatter:on
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
