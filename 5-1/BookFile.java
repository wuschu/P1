import java.util.*;
import java.io.*;



public class BookFile{
	
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public BookFile(String path){}
	
	protected String toLine(Book book){
		String newLine = String.valueOf(book.getId()) + ", " + book.getTitle() + ", " + book.getAuthor() + 
			", " + String.valueOf(book.getYear()) + ", " + String.valueOf(book.getPrice());
	
	return newLine;
	}
	
	protected Book parseLine(String line) throws BookFileException{
		Scanner scn = new Scanner(new File("books.csv")).useDelimiter("\\s*,\\s*");
		
	
		
	}
	
	public void save(ArrayList<Book> books){
		PrintWriter file = new PrintWriter(
			new BufferedWriter(new FileWriter("testfile.csv")));
		file.println();
		file.close();
	
	}
	
	public ArrayList<Book> load(){
		
	}
	
}
