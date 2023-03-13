package test;

public class LargestEleOFArray {

	public static void main(String[] args) {
		int a[]= {7,3,300,8,100,1,6,800,9,2,4};
		int large=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
			if(a[i]>a[j]) {
			large=a[i];
			a[i]=a[j];
			a[j]=large;
			}
			}
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.print(" " +a[i]);
	}
		System.out.println();
	System.out.println(a[a.length-2]);
}
}
