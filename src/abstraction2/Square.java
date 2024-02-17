package abstraction2;

public class Square extends Shape {

	@Override
	double calculateArea() {
		double s= 4.0;
		double area = s*s;
		return area;
	}

}
