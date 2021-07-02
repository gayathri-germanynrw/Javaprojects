package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolLibrary {
	
	public static void main(String[] args) {
		List<Book> books=new ArrayList<>(); 
		Book book1=Book.builder().withSerialNo(1).withName("Born to Win").withGenre("Motivation").build();
		Book book2=Book.builder().withSerialNo(2).withName("Playing with Kids").withGenre("Kids").build();
		Book book3=Book.builder().withSerialNo(3).withName("Cooking Western").withGenre("Cooking").build();	
		Book book4=Book.builder().withSerialNo(4).withName("Aerospace sciene ").withGenre("Science").build();
	    books.add(book1);
	    books.add(book2);
	    books.add(book3);
	    books.add(book4);
	    System.out.println("Before Sort of Books ---->"+books);
	    Collections.sort(books);
	    System.out.println("After Sort of Books ---->"+books);
	    
	    
	}

}
