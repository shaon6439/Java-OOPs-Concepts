package polymorphism_overriding2;

public class VechicleMain {

	public static void main(String[] args) {
		Bicycle b = new Bicycle();
		b.speedUp(3);
		Car a = new Car();
		a.speedUp(4);
		Vehicle v = new Vehicle();
		v.speedUp(3);
	}

}
