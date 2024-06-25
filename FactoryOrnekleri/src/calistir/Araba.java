package calistir;

public class Araba {
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
