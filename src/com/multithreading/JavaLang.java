/**
 * 
 */
package com.multithreading;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class JavaLang implements Language, Runnable {

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Java Program is running.");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		showMessage();
	}

}
