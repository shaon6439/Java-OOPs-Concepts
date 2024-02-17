package inheritance_Hierachical2;

public class Main {

	public static void main(String[] args) {
		Rectangle_Child r = new Rectangle_Child();
		r.colour();
		r.areaRectangle();
		
		Triangle_Child t = new Triangle_Child();
		t.colour();
		t.areaTriangle();
		
		Square_Child s = new Square_Child();
		s.colour();
		s.areaSquare();

	}

}
