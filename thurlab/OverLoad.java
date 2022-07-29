public class OverLoad{
	public static void overLoad(){
		System.out.println("method is called ");
	}
	public static void overLoad(int a){
		System.out.println("overloaded method  called "+a);
	}
	public static void main(String args[])
	{
		OverLoad.overLoad();
		OverLoad.overLoad(10);
	}
}




