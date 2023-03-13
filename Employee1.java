package test;

public class Employee1 {
	int eid;
	String name,dept;
	Employee1(int eid, String name, String dept){
		this.eid=eid;
		this.name=name;
		this.dept=dept;
	}
	public String toString() {		
		return eid+" "+name+" "+dept;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1= new Employee1(10,"Satish","Software");
		Employee1 e11= new Employee1(11,"Abhishek","Development");
		System.out.println(e1);		//if we don't override toString() it will print hashcode of the String
		System.out.println(e11);
	}

}
