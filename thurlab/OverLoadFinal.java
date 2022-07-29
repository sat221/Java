public class OverLoadFinal{
	public final void overLoad(){
		System.out.println("method is called ");
	}
	public final void overLoad(int a){
		System.out.println("overloaded method  called "+a);
	}
	public static void main(String args[])
	{
		OverLoad.overLoad();
		OverLoad.overLoad(10);
	}
}