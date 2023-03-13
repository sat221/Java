package test;
import java.lang.StringBuffer;
class Satish1{
	Satish1(int a){
		System.out.println("int argument constructor "+a);
	}
	Satish1(String a){
		System.out.print("String argument constructor "+a);
	}
	Satish1(){
		System.out.println("no argument constructor");
	}
}
public class StringBufferMethods {

	public static void main(String[] args) {
		Satish1 s= new Satish1(89654);
		StringBuffer a= new StringBuffer();
		//StringBuffer s="Satish";   // this is not possible unlike String class
		String b= new String("Abhishek");
		
		StringBuffer c= new StringBuffer(b);
		//a.append(" Borale");
		c.append(a);
		//a.insert(2,"Borale");
		//System.out.println(a);
		//a.replace(1,3,"urty");
		//a.delete(7,9);
//		a.delete(7,9);
		a.reverse();
		//System.out.println(a.capacity());
		a.append("Satish");
		a.ensureCapacity(10);// no change in the capacity
		//System.out.println(a.capacity());
		a.ensureCapacity(17);// should be increased to 34
		//a.append(" is a good boy");// increases the capacity by 16*2+2=34
		System.out.println(a.capacity());
		a.ensureCapacity(35);
		System.out.println(a.charAt(3));
		System.out.println(a.substring(1, 4));
		System.out.println(a.substring(3));
		System.out.println(a.subSequence(2, 5));
		System.out.println(a.length());
	}

}
