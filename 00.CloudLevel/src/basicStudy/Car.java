package basicStudy;

public class Car {
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	Car(String model) {
		this(model, "파란색", 550);
	}
	
	Car(String model, String color) {
		this(model, color, 1050);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
