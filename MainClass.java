package test;

class Demo1{
	int x=12;
	void test() {
		System.out.println("test() is running with value "+x);
	}
}
class Sample{
	void square(int num) {
		int result=num*num;
		System.out.println("the square of "+num+" is "+result);
	}

void display(Demo1 ar1) {
	System.out.println("running Display method");
	//ar1.x=25;
	int c = ar1.x*ar1.x*ar1.x;
	System.out.println("the cube of "+ar1.x+" is "+c);
	ar1.test();
}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s1 = new Sample();
		s1.square(5);
		s1.display(new Demo1());
		//Demo1 d1 = new Demo1();
		//s1.display(d1);
	}

}
