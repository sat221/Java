package test;

public class FrequencyOfEle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,5,7,7,4,2,1,1,8,3,4,4};
		int[]b=new int[a.length];
		int h=-1;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				//int count=1;
				if(a[i]==a[j]) {
					count++;
					b[j]=h;
				}
			}
			if(b[i]!=h) {
			b[i]=count;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			//if(b[i]!=-1) {
				System.out.println(a[i]+" "+b[i]);
			//}
		}
	}

}
