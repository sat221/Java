package test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		String firstString="first";
	int 	a[]= {1,2,3,4,5};
	System.out.println("actual array");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
	}
	System.out.println("reversed array");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
		
	}

}
