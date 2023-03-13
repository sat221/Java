package test;

//import java.util.Scanner;  
import java.lang.Math;  
public class Armstrong{	
	public static void main(String args[]){     
		    int digit=0, last=0, sum=0, n=153;
		    int n1=n;
		    int temp=n;
		    	
		    	while(n1!=0){
		    		n1=n1/10;
		    		digit++;
		    	}
		    	while(n!=0) {
		    		last=n%10;
		    		sum+=Math.pow(last, digit);
		    		n=n/10;
		    	}
		    	if(sum==temp)
		    		System.out.print("given number  "+temp+" is a armstrong number");
		    	
		    	else 
		    		System.out.println("given number"+temp+" is not a armstrong number");		    	
		    }
}   
  