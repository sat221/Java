package test;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  []a = {1,2,3,4,5,6};
      int []b =new  int[a.length];
      System.out.println(" original array");
      for (int i=0; i<a.length;i++) {
    	  b[i]=a[i];
    	  System.out.print("  "+a[i]);
      }
      System.out.println(" copy array");
      for(int i=0;i<b.length;i++) {
    	  System.out.print("  "+b[i]);
      }
	}

}
