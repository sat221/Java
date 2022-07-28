
import java.util.StringTokenizer;
 class StringY{
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("today is monday"," ");
		while(st.hasMoreTokens()){
		System.out.println(st.nextToken());
		}
		}
		}