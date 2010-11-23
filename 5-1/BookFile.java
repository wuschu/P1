import java.util.*;
import java.io.*;



public class BookFile{
	//Instanzvariabeln
	private ArrayList<Book> books = new ArrayList<Book>();
	public String filename; 
	
	//Constructor
	public BookFile(String filename){
		this.filename = filename;
	} 
	
	//makes a book-object out of a comma-seperated string (csv)
	protected String toLine(Book book){
		String newLine = String.valueOf(book.getId()) + ", " + book.getTitle() + ", " + book.getAuthor() + 
			", " + String.valueOf(book.getYear()) + ", " + String.valueOf(book.getPrice());
	
	return newLine;
	}
	
	protected Book parseLine(String line) throws BookFileException{
		Scanner scn = new Scanner(line);
		scn.useDelimiter(",");
		Book tempBook = new Book();
		tempBook.setId(Integer.parseInt(scn.next().trim()));
		tempBook.setTitle(scn.next().trim());
		tempBook.setAuthor(scn.next().trim());
		tempBook.setYear(Integer.parseInt(scn.next().trim()));
		tempBook.setPrice(Integer.parseInt(scn.next().trim()));
		
		return tempBook;
		
	}
	
	public void save(ArrayList<Book> books){
	//toLine
	
	}
	
	public ArrayList<Book> load(){
	//parseLine
	}
	
}
