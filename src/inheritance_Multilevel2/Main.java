package inheritance_Multilevel2;

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.automobile();
		c.toyotaCar();
		SUV s = new SUV();
		s.automobile();
		s.toyotaCar();
		s.toyotaSUV();
		
	}

}
