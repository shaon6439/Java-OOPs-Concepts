package StringBuffer;

import java.util.StringTokenizer;

public class StringTokentoal{

	public static void main(String[] args) {
		String str = "We love our country";
		StringTokenizer str1 = new StringTokenizer(str);
		while(str1.hasMoreTokens())
		{
			System.out.println(str1.nextToken());
		}
		
	}

}


