package org.lessons.java.books;

public class Book {
	private String title;
	private int pagesNum;
	private String author;
	private String publisher;
	
	public Book(String title, int pagesNum, String author, String publisher) {
		
		setTitle(title);
		setPagesNum(pagesNum);
		setAuthor(author);
		setPublisher(publisher);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPagesNum() {
		return pagesNum;
	}
	public void setPagesNum(int pagesNum) {
		this.pagesNum = pagesNum;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

	
	
}
