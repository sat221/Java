package test;

 class H {
	H(){
		System.out.println("in superclass");
	}
	}
class Iib extends H{
Iib() {
	super();
	System.out.println("in subclass");
}
{
	System.out.println("instance initialization block");
}


	public static void main(String[] args) {
		Iib i=new Iib();
		// TODO Auto-generated method stub

	}

}
