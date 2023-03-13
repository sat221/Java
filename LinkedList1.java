package test;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<String> link= new LinkedList<>();
		int a[]= {5,3,7,2,9,1};
//		link.add("Satish");
//		link.addLast("Ambarish");
//		link.add("Abhishek");
//		link.addFirst("Sangamesh");
//		//link.clear();
//		link.remove("Ambarish");
//		link.remove(1);
//		LinkedList <String> l2=new LinkedList<>();
		LinkedList <Integer> l4=new LinkedList<>();
//		l2.addAll(link);
//		l2.add("rose");
//	Iterator<String>l3=l2.descendingIterator();
//		while(l3.hasNext()) {
//			System.out.print(l3);
//		}
//		System.out.print(l2);
//		
		for(Integer i: a) {
			l4.add(i);
		}
		System.out.println(l4);
		Collections.sort(l4);
		ListIterator<Integer>l=l4.listIterator();
//		while(l.hasNext()) {
//			System.out.print(l.next()+" ");
//		}
		
		//System.out.println(l4);
//		for(Integer i: l4) {
//			System.out.print(" "+i);
//		}
		while(l.hasNext()) {
			System.out.print(" "+l.next());
		}
		System.out.println("");
		while(l.hasPrevious()) {
			System.out.print(" "+l.previous());
		}
	}

}
