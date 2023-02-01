/**
 * 
 */
package com.book;

import java.util.Arrays;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class Book {
	private String bookID;
	private String title;
	private String author;
	private String category;
	private double price;
	private final String[] VAILD_CATEGORY = {"Science", "Fiction", "Technology", "Others"};
	/**
	 * @param bookID
	 * @param title
	 * @param author
	 * @param category
	 * @param price
	 */
	public Book(String bookID, String title, String author, String category, double price) {
		category = category.substring(0,1).toUpperCase() + category.substring(1,category.length()).toLowerCase();
		if (!Arrays.asList(VAILD_CATEGORY).contains(category)) {
			throw new InvalidBookException("Not a vaild category.");
		}
		if (price < 0) {
			throw new InvalidBookException("Price cannot be negetive.");
		}
		if (bookID.length() != 4 || bookID.charAt(0) != 66) {
			throw new InvalidBookException("Not vaild book ID.");
		}
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	/**
	 * @return the bookID
	 */
	public String getBookID() {
		return bookID;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "bookID = " + bookID + ", title = " + title + ", author = " + author + ", category = " + category
				+ ", price = " + price;
	}
	
	
	
}
