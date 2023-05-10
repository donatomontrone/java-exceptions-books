package org.lessons.java.books;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	private static final String FILEPATH = "/Users/donatomontrone/file.txt";
	
	public static void main(String[] args) throws Exception {
		
		Scanner in = new Scanner(System.in);
		
		int booksNum = 0;
		
		boolean isNum = false;
		
		while (!isNum) {
			
			System.out.print("Inserisci il numero di libri che intendi aggiungere alla lista: ");
			try {
				
				booksNum = in.nextInt();
				isNum = true;
				
			} catch (Exception e) {
				System.err.println("Inserisci un numero.");
				//in.nextInt(); 
				//in.next();
				in.nextLine();
			}
		}
		
		
		in.nextLine();
		
		Book[] books = new Book[booksNum];
		
		System.out.println("\nBene, hai deciso di aggiungere " + books.length + " libri.");
		
		System.out.println("Adesso aggiugniamo i libri... \n");

		for (int i = 0; i < books.length; i++) {
			
				System.out.println("Inserisci il titolo del libro");
				String title = in.nextLine();
				
				System.out.println("Inserisci il numero di pagine del libro");
				int pages = in.nextInt();
				
				in.nextLine();
				
				System.out.println("Inserisci l'autore del libro");
				String author = in.nextLine();
				
				System.out.println("Inserisci la casa editrice del libro");
				String publisher = in.nextLine();
				
				try {
					
					books[i] = new Book(title, pages, author, publisher);					
				
				} catch (Exception e) {
					i--;
					System.err.println("Impossibile aggiungere il libro - " + e.getMessage());
				}
		}
		in.close();
		
		
		//WRITING
		
		try (FileWriter fw = new FileWriter(FILEPATH)) {
			for (int i = 0; i < books.length; i++) {
				if (books[i] != null) {		
					fw.write(books[i].toString() + "\n");
				} 
				
				System.out.println("Sto scrivendo.... [Libro " + (i+1) + "]\n");
			}
		fw.close();
		} catch (Exception e) {
			System.err.println("Impossibile scrivere sul file (" + FILEPATH + ") - " + e.getMessage());
		}
		
		//READING
		try {
			File fl = new File(FILEPATH);
			Scanner reader = new Scanner(fl);
			
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);			
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.err.println("Errore nella lettura del file -" + e.getMessage());
		}
		
	}
	
}
