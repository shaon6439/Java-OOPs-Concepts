package StringBuffer;

public class string_buffer2 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Hello");
		System.out.println(buf);
		System.out.println(buf.append(" World"));
		System.out.println(buf.insert(5,  "_java"));
		System.out.println(buf.replace(5, 6, "" ));
		System.out.println(buf.charAt(6));
		System.out.println(buf.deleteCharAt(3));
		System.out.println(buf.capacity());
		System.out.println(buf.reverse());
	}
}
