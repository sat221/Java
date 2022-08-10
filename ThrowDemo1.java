public class ThrowDemo1{
static void validate(int age){
if(age<22)
throw new ArithmeticException("invalid");
else
System.out.println("welcome on board");
}
public static void main(String args[]){
validate(24);
System.out.println("code remainder");
}
}