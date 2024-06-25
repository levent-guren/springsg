package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "bean" })
public class AppConfig {
	@Bean
	public Motosiklet motosikletOlustur() {
		Motosiklet motosiklet = new Motosiklet();
		motosiklet.setMotor(new BenzinliMotor());
		return motosiklet;
	}
}
