package org.lessons.java.books;

public class Book {
	private String title;
	private int pagesNum;
	private String author;
	private String publisher;
	
	public Book(String title, int pagesNum, String author, String publisher) throws Exception {
		
		setTitle(title);
		setPagesNum(pagesNum);
		setAuthor(author);
		setPublisher(publisher);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) throws Exception {
		if (title.length() <= 0 ) {
			throw new Exception("Inserire il titolo del libro");
		} 
		
		this.title = title;
	}
	public int getPagesNum() {
		return pagesNum;
	}
	public void setPagesNum(int pagesNum) throws Exception {
		if (pagesNum <= 0) {
			throw new Exception("Inserisci il numero di pagine del libro");
		}
		
		this.pagesNum = pagesNum;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) throws Exception{
		
		if (author.length() <= 0) {
			throw new Exception("Inserisci il nome dell'autore");
		}
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) throws Exception {
		if (publisher.length() <= 0) {
			throw new Exception("Inserisci la casa editrice del libro");
		}
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {

		return "[Book] " + getTitle() + " - Autore: " + getAuthor() 
		+ "\nPagine: (" + getPagesNum() + ") - Casa Editrice: " + getPublisher();
	}
	

	
	
}
