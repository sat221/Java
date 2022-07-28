import java.util.Scanner;
class ArrayExample{
	public static void main(String aw[]){
		int n=5;
		int sum=0;
	int mark[]= new int[n];
	Scanner sc= new Scanner(System.in);
	
	for(int i=0; i<n;i++){
	System.out.println("enter the array numbers:"+i);
	mark[i]=sc.nextInt();
	sum = sum+mark[i];
}
for(int i=0;i<n;i++){
	System.out.print(mark[i]+"	");
	
}
System.out.println();
System.out.println("the sum of the array is: "+sum);
System.out.print(aw[3]);
}
}