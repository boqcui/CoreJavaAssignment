/**
 * 
 */
package com.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class BookStore {
	// Book ID should be unique, 
	// If two books have the same ID, the new book should replace the old book.
	HashMap<String, Book> bookMap = new HashMap<>();
	
	public void addBook(Book b) {
		bookMap.put(b.getBookID(), b);
	}
	
	// In case if there has more than one book has the same name or author,
	// so all search methods will return a list of book.
	public List<Book> searchByTitle(String title) {
		return search(title, "title");
	}
	
	public List<Book> searchByAuthor(String author) {
		return search(author, "author");
	}
	
	public List<Book> displayAll() {
		return search(null, "all");
	}
	
	private List<Book> search(String searchContent, String searchType) {
		List<Book> res = new ArrayList<>();
		for (Entry<String, Book> entry : bookMap.entrySet()) {
			if (searchType.equals("title") && entry.getValue().getTitle().equals(searchContent)) {
				res.add(entry.getValue());
			}
			if (searchType.equals("author") && entry.getValue().getAuthor().equals(searchContent)) {
				res.add(entry.getValue());
			}
			if (searchType.equals("all")) {
				res.add(entry.getValue());
			}
		}
		return res;
	}
}
