//****************************************************************************
//
//	Dominik Feller
//	Matrikel-Nr. 06-117-949
//
//	BookTest.java
//
//****************************************************************************

import java.util.Date;
import java.text.*;

public class BookTest
{
	public static void main(String[] args) throws ParseException
	{
		Book book1;
		
		//creating a new object of the class Book
		book1 = new Book();
		
		System.out.println ();
		System.out.println (book1);
		System.out.println ();
		System.out.println ("Days since publication: "); 
		System.out.println (book1.age() + " days");
		
		System.out.println ();
		
		//using the getters and setters of Book.java to change
		//the values
		book1.setId(999);
		book1.setTitle("Die Aufgabe 2-2 von P1");
		book1.setAuthor("Dominik Feller");
		book1.setDateOfPublication("10.10.2010");
		
		System.out.println ("After using the getters and setters: ");
		System.out.println (book1);
		System.out.println ();
		System.out.println ("Days since publication: ");
		System.out.println (book1.age() + " days");
		
	}
	
}
