package abstraction2;

public class AbstractDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		double area = c.calculateArea();
		c.setColor("Red");
		System.out.println("Area of circle " + area);
		Square s = new Square();
		double area1 = s.calculateArea();
		s.setColor("Green");
		System.out.println("Area of square " + area1);
	}

}
