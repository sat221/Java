import java.util.Scanner;
class CheckNumber{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("Enter the number");
	n = sc.nextInt();
	if(n>0){
	System.out.println("The number entered is "+n+" and it is a positive number");
	}
	else{
	System.out.println("The number entered is "+n+" and it is not a positive number");
	}
}
}	