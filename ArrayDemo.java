package test;
import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> l=new Stack<String> ();
		l.push("rose");
		l.push("jack");
		l.push("titanic");
		l.pop();
	Iterator <String>i=l.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		

	}

}
