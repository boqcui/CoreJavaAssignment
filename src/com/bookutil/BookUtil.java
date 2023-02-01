/**
 * 
 */
package com.bookutil;

import java.util.List;
import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class BookUtil {
	private BookStore bookStore;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookUtil bookUtil = new BookUtil();
		//Read data from user for 3 Book objects and add books.
		bookUtil.addBook(bookUtil.askForBook(sc));
		bookUtil.addBook(bookUtil.askForBook(sc));
		bookUtil.addBook(bookUtil.askForBook(sc));
		
		System.out.println("Search books by title, please enter book title: ");
		String title = sc.nextLine();
		bookUtil.searchTitle(title);
		
		System.out.println("Search books by author, please enter book author: ");
		String author = sc.nextLine();
		bookUtil.searchAuthor(author);
		
		System.out.println("Display all books: ");
		bookUtil.displayAllBooks();
		sc.close();
	}
	
	
	
	/**
	 * @param bookStore
	 */
	public BookUtil() {
		this.bookStore = new BookStore();
	}
	
	private Book askForBook(Scanner sc) {
		System.out.println("Please enter book ID: ");
		String bookID = sc.nextLine();
		System.out.println("Please enter book title: ");
		String bookTitle = sc.nextLine();
		System.out.println("Please enter author name: ");
		String author = sc.nextLine();
		System.out.println("Please enter book's category: ");
		String category = sc.nextLine();
		System.out.println("Please enter book's price: ");
		double price = Double.parseDouble(sc.nextLine());
		return new Book(bookID, bookTitle, author, category, price);
	}
	
	private void addBook(Book book) {
		this.bookStore.addBook(book);
	}
	
	private void searchTitle(String title) {
		List<Book> res = this.bookStore.searchByTitle(title);
		displayBooks(res);
	}
	
	private void searchAuthor(String author) {
		List<Book> res = this.bookStore.searchByAuthor(author);
		displayBooks(res);
	}
	
	private void displayAllBooks() {
		List<Book> res = this.bookStore.displayAll();
		displayBooks(res);
	}
	
	private void displayBooks(List<Book> bookList) {
		for (Book b : bookList) {
			System.out.println(b.toString());
		}
	}

}
