package tr.gov.sg.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	private static final long serialVersionUID = -2027507659711810033L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
		// List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		// authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		// return authorities;
	}

	@Override
	public String getPassword() {
		return "123";
	}

	@Override
	public String getUsername() {
		return "ali";
	}

}
