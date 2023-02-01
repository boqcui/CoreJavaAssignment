/**
 * 
 */
package com.book;

import java.util.concurrent.ExecutionException;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class InvalidBookException extends RuntimeException{
	
	public InvalidBookException() {
		
	}
	
	public InvalidBookException(String message) {
		super(message);
	}
}
