package test;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,5,6,3,0,-1,9,2};
		int small=109;
		for(int i=0;i<a.length;i++) {
			//3 
			//2
			if(small>a[i]) {
				small=a[i];
			}
		}
		System.out.println(small);
	}

}
