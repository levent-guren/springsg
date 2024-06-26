package tr.gov.sg.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class ProfileTest implements CommandLineRunner {
	@Value("${isim:değer bulunamadı}")
	private String isim;

	@Override
	public void run(String... args) throws Exception {
		log.info("Okunan isim:" + isim);
	}

}
