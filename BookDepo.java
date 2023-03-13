package test;
import java.util.*;
class Book{
	int id,quantity;
	String name,author,publisher;
	Book(int id,String name,String author,String publisher,int quantity){
			this.id=id;
			this.name=name;
			this.author=author;
			this.publisher=publisher;
			this.quantity=quantity;
	}
	
}
public class BookDepo {

	public static void main(String[] args) {
		ArrayList<Book> book= new ArrayList<Book>();
		Book b1= new Book(1,"life","satish","abhi",10);
		Book b2= new Book(2,"love","snowbear","blackbear",20);
		Book b3= new Book(3,"friend","sangamesh","abhi",30);
		book.add(b1);
		book.add(b2);
		book.add(b3);
//		for(Book b: book) {
//			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
//		}
	Iterator<Book> itr= book.iterator();
	while(itr.hasNext()) {
		Book bk=(Book)itr.next();
		System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);
	}
	}

}
