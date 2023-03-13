package test;

public class StringCount {
	public static void main(String a[]) {
		String sre= "hi this is satish";
		int count=0;
		for(int i=0;i<sre.length();i++) {
			if(sre.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
