package test;

public class OvelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "Hi this is satish";
		int vc=0,cc=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				vc++;
			}
			else
				cc++;
		}
		System.out.println("vowels  "+vc);
		System.out.println("consulants "+cc);
	}

}
