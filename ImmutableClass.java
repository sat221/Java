package test;

	 final class Employee{
		final int a;
		public Employee(int a) {
			this.a=a;
		}
		public int getA() {
			return a;
		}
		
	}

public class ImmutableClass {
	public static void main(String[] args) {
		Employee e= new Employee(25);
		String a1= Integer.toString(e.getA());
		System.out.println(a1.hashCode());
		System.out.println(e.getA());
	}

}
