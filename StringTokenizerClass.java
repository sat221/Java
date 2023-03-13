package test;

import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
			StringTokenizer st= new StringTokenizer("Hi/this/is/Satish");
			while(st.hasMoreTokens()) {
				//nextToken(String delim); checks the delimeter such as , / . etc
				System.out.println(st.nextToken("/"));
			}
//			while(st.hasMoreElements()) {
//				System.out.println(st.nextElement());
//			}
			System.out.println(st.countTokens());
	}

}
