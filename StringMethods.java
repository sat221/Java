package test;

public class StringMethods {

	public static void main(String[] args) {
		String a="Satish is a good boy, Satish have a positive attitude";
		/*System.out.println(a.trim());
		System.out.println(a.substring(4));
		System.out.println(a.substring(2,5));
		System.out.println(a.replace('b','t'));
		System.out.println(a.replace("boy","person"));
		System.out.println(a.startsWith("sati"));
		System.out.println(a.endsWith("oy"));
		System.out.println(a.charAt(10));
		System.out.println(a.indexOf('b'));
		System.out.println(a.indexOf('s',1));*/
		int b=a.lastIndexOf("is",8);
		//System.out.println(b);
		String b1=a.intern();
		System.out.println(b1);
		String c=a.replace("Satish","Abhishek");
		String d=c.replace("boy", "girl");
		System.out.println(d);
	}

}
