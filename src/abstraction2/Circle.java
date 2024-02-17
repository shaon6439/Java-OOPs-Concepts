package abstraction2;

public class Circle extends Shape {

	@Override
	double calculateArea() {
		int r=4;
		double area = 3.14*r*r;
		return area;
	}
	
	

}
