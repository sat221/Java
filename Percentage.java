abstract class Marks{
	abstract float getPercentage();
	} 
	class A extends Marks{
		float total=0;
		float percentage=0;
		A(float x, float y, float z){
			total=x+y+z;
			}
		public float getPercentage(){
			percentage=(total)/3;
			return percentage;
			}
			}
	class B extends Marks{
		float total=0;
		float percentage=0;
		B(float x,float y,float z,float w){
			total=x+y+z+w;
			}
		public float getPercentage(){
			percentage=(total)/4;
			return percentage;
			}
			}
class Percentage{
	public static void main(String[] ar){
			A m1=new A(68.0f,85.0f,59.0f);
			System.out.println("Percentage secured by A is:"+m1.getPercentage());
			B m2=new B(88.58f,58.5f,48.7f,85.0f);
			System.out.println("Percentage secured by B is:"+m2.getPercentage());
		}
		}