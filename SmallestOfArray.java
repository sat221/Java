package test;

public class SmallestOfArray {
	//int a[]= {4,6,89,34,7,3,16,4};
public static int smallest() {
	int a[]= {4,6,89,34,7,3,16,4};
	int s=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<s) {
			s=a[i];
		}
	}
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(SmallestOfArray.smallest());
		
	}

}
