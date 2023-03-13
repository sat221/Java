package test;

public class MatrixArray {

	public static void main(String[] args) {
int a[][]= {{1,2,3},{1,4,5},{4,5,2}};
int b[][]= {{1,2,3},{6,5,2},{4,7,6}};
int c[][]=new int[3][3];
System.out.println(" Array a[][]       b[][]       c[][]");
for(int i=0;i<3;i++){
	
	for(int j=0;j<3;j++) {
		c[i][j]=a[i][j]+b[i][j];
		System.out.print("  "+c[i][j]);
	}
	System.out.println();
}
	}

}
