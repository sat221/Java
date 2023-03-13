package test;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,1,0,8,5};
		//2 5 1
		//1 5 2 0 
		//0 5 2 1 8 5
		//0 5 2
		//0 2 5 
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println("the sorted array is:"+a[i]);
		System.out.println(a[a.length-1]);

	}
	}

}
