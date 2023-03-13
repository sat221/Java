package test;

public class LeftShift {

	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println("original array");
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}
	System.out.println();
     int j, n=3;
     for(int i=0;i<1;i++) {
    	 int last=a[a.length-1];
    	 for( j=a.length-1;j>2;j--) {
    		a[j]=a[j-1];
    		}
    	a[0]=last;
    	 }
     System.out.println("Right shifted array");
     for(int i=0;i<a.length;i++) {
    	 System.out.print(" "+a[i]);
     }
     
 	System.out.println();
 	int b[]= {1,2,3,4,5};
      int k, m=3;
      for(int i=0;i<1;i++) {
     	 int first=b[0];
     	 for( k=0;k<b.length-1;k++) {
     		b[k]=b[k+1];
     		
     		}
     	 b[k]=first;
     	 }
      System.out.println("Left shifted array");
      for(int i=0;i<b.length;i++) {
     	 System.out.print(" "+b[i]);
      }
	}

}
