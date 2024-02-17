package polymorphism_overriding;

public class Overriding {

	public static void main(String[] args) {
		Bird b = new Bird();
		Animal a = new Animal();
		a.eat();
		b.eat();
		Wild w = new Wild();
		w.eat();
	}
}
