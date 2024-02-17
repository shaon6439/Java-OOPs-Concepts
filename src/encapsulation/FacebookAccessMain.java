package encapsulation;

public class FacebookAccessMain {
public static void main(String[] args) {
	Facebook fb=new Facebook();
	System.out.println(fb.name);
	System.out.println(fb.age);
	System.out.println(fb.collageNmae);
	//fb.setPhNumber("12345678");
	System.out.println(fb.getPhNumber());
	
}
}
