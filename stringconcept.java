package test;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Arrays;
//import java.util.List.*;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class stringconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Satish"+60+"40"+"nkh";
		String s1="satish";
		String s="decap";
		s=s.concat(s1);
		StringJoiner sj=new StringJoiner(",");
		sj.add("Sangu");
		sj.add("Rabbal");
		String s2=String.format("%s%s",s1,s);
		//System.out.println(s.concat(s1));
		//System.out.println(s+" "+s1);
		//System.out.println(s.concat("ajdffdjew"));
		//String s= new String("Satish");
		//String s1=  new String("Satish");
	//System.out.println(s2.toString());
	//System.out.println(sj.toString());
//		System.out.println(s.equals(s1));
//		System.out.println(s.equalsIgnoreCase(s1));
//		System.out.println(s==s1);
		//System.out.println(s.compareTo(s1));
		//System.out.println(s1);
		//String concatination using collection
	List<String> str= Arrays.asList("Satish","Sangu");
	String str1=str.stream().collect(Collectors.joining(""));
	System.out.println(str1.toString());
	}

}
