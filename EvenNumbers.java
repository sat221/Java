package test;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,3,5,4,8,9,4};
		int even=0,odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) {
				//System.out.println("even numbers are:"+a[i]);
				even++;
			}
			else {
				//System.out.println("odd numbers"+a[i]);
				odd++;
			}
		}
System.out.println(even);
System.out.println(odd);
	}

}
