package test;

public class FrequencyOfElementInArray {
public static void main(String a[]) {
	int a1[]= {1,1,2,2,3,2,5,6,4,3,6,7,6,7,3,4};
	//int b[]= {1,2,3,4,5,6,7};
	
	int fr[] = new int[a1.length];
	//int visited=-1;
	for(int i=0;i<a1.length;i++) {
		int count=1;
		for(int j=i+1;j<a1.length;j++) {
			if(a1[i]==a1[j]) {
			 count++;
				fr[j]=-1;
			}
			
		}
		if(fr[i]!=-1)
		fr[i]=count;
	}
		System.out.println("------------------------------");
		System.out.println("element| Frequency");
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=-1)
				System.out.println("     "+a1[i]+"   | "+fr[i]);
		
	}
		System.out.println("-------------------------");
		for(int i=0;i<fr.length;i++) {
			System.out.print(" "+fr[i]);
		}
}
}
