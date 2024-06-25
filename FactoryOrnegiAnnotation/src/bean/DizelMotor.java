package bean;

import org.springframework.stereotype.Component;

@Component
public class DizelMotor implements Motor {
	public DizelMotor() {
		System.out.println("DizelMotor oluşturuluyor");
	}

	public void deviriArttir() {

	}

	@Override
	public String toString() {
		return "DizelMotor []";
	}

}
