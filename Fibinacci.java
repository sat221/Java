package test;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,n3;
System.out.println("Fibinacci number");
for(int i=0;i<10;i++) {
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
}
	}

}
