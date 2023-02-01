/**
 * 
 */
package com.multithreading;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class CLang implements Language, Runnable {

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("C Program is running.");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		showMessage();
	}

}
