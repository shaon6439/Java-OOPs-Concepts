package StringBuffer;

public class string_buffer {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("hello");
		System.out.println(buf);
		System.out.println(buf.append("world"));
		System.out.println(buf.insert(5,  "+java"));
	}
}
