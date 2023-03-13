package test;
import java.util.*;
public class ArrayList1 {
	public static void main(String []args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(6);
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(5);
		a1.addAll(4,a);
		
		//a.addAll(a1);
		a.add(3,6);
		a1.remove(5);
		//a1.removeRange(3,5);
		//System.out.println(a1);
		//System.out.println(a1.containsAll(a));
		//System.out.println(a.contains(5));
		//System.out.println(a.indexOf(5));
		//System.out.println(a.lastIndexOf(5));
		//System.out.println(a.isEmpty());
		//System.out.println(a1.size());
		//System.out.println(a1.hashCode());
		//System.out.println(a.equals(a1));
		//System.out.println(a.equals(1));
		//System.out.println(a.iterator());
		//a.set(3,546);
		//Collections.sort(a);
//		Iterator<Integer> itr=a1.iterator();
//		for(Integer in: a1) {
//		System.out.print(" in"+in);
//		}
		a1.retainAll(a);
//		a1.forEach(b->{
//			System.out.println(b);
//		});
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		for (int i=0;i<a1.size();i++) {
			System.out.print("  "+a1.get(i));
		}
		
		
	}

}
