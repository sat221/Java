
import java.util.StringTokenizer;
 class StringX{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("you are a woman"," ");
		while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
		}
		}
		}