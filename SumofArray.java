package test;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		//sum=a[0]+a[1]+a[2]+a[3]+a[4];
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.print(sum);
	}

}
