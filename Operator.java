import java.util.Scanner;
class Operator{
public static void main(String[] args){
int a;
int b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a ");
a=sc.nextInt();
System.out.println("enter the value of b ");
b=sc.nextInt();
System.out.println("Addition of a and b :  " +(a+b));
System.out.println("Substraction of a and b:  "+(a-b));
System.out.println("Multiplication of a and b:  "+(a*b));
System.out.println("Division of a and b:  "+(a/b));
System.out.println("If a is greater than b:  "+(a>b));
System.out.println("If a is smaller than b:  "+(a<b));
}
}