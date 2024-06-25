package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Araba {
	@Autowired
	@Qualifier("dizelMotor")
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void hizlan() {
		motor.deviriArttir();
	}

	@Override
	public String toString() {
		return "Araba [motor=" + motor + "]";
	}

}
