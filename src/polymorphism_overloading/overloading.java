package polymorphism_overloading;

public class overloading {

	//compile time polymorphism
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	void add(double a, double b) {
		double c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		overloading o = new overloading();
			o.add(2.0, 3.0);
			o.add(2, 3);

	}
	
	

}
