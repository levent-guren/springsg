package bean;

public class Motosiklet {
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Motosiklet [motor=" + motor + "]";
	}

}
