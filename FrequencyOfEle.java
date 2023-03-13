package test;

public class FrequencyOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {1,2,3,4,5,6};
		int a[]= {1,2,1,2,3,4,2,3,5,4,4,5,3,6,4,3,6,4,2,4,6,2};
		
		//int count=1;
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					count++;
				}
				
			}
			System.out.println("the frequency of element "+b[i]+" is "+count);
		}
	}

}
