package test;

  class Satish{
    void disp(){
        System.out.println("this is superclass display method");
    }
}
 class Abhi extends Satish1{
	// @override
    void display(){
        System.out.println("this is subclass display method");
    }
    public static void main(String[] args){
        Abhi aa= new Abhi();
        aa.display();
    }
}