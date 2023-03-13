package test;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abhi";
		String b = "ihbb";
		char temp;
		if(a.length()!=b.length()) {
			System.out.println("the given strings are not anagram");
		}
		else {
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				
				if(b1[i]>b1[j]) {
					temp=b1[i];
					b1[i]=b1[j];
					b1[j]=temp;
				}
			}
		}
		for(int i=0;i<b1.length;i++) {
			for(int j=i+1;j<b1.length;j++) {
				
				if(a1[i]>a1[j]) {
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		int c=1;
		for(int i=0; i<a1.length;i++) {
			//c=1;
			if(a1[i]!=b1[i]) { 
				 c=-1;
				 break;
			}
			//System.out.println(" "+a1[i]+" "+b1[i]);
			}
			// Arrays.sort(a1);  
	          //  Arrays.sort(b1);  
		//if (Arrays.equals(a1, b1)==true) 
		if(c==1){
			System.out.println("the given strings are anagram");
		}
		else {
			System.out.println("the given strings are not anagram");
		}
		for(int i=0; i<a1.length;i++) {
			
			
			System.out.println(" "+a1[i]+" "+b1[i]);
			}
		}
	}
}


