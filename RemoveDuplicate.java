package test;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[]= {1,1,1,2,2,3,3,4,4,5,5,5,6,9};
		int j, nim=-1;
		for(int i=0;i<a.length;i++) {
			//int j, nim=-1;
			for( j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=nim;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=nim)
			System.out.print(" "+a[i]);
		}
	}

}
