/**
 * 
 */
package com.multithreading;

import java.util.Scanner;

/**
 * @author: Boqiang Cui
 * @date: Feb 1, 2023
 */
public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLang c = new CLang();
		JavaLang java = new JavaLang();
		Thread cThread = new Thread(c);
		Thread javaThread = new Thread(java);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your favorite language? --- Enter 1 for C, 2 for java.");
		int choice = sc.nextInt();
		
		/*
		 * The code inside run() method is so simple, because the code will execute the thread with lower priority first,
		 * sometime your preferred output may print after other one. You may try multiple times to get your preferred output.
		 */
		if (choice == 1) {
			cThread.setPriority(Thread.MAX_PRIORITY);
			javaThread.setPriority(Thread.MIN_PRIORITY);
			javaThread.start();
			cThread.start();
		} 
		else if (choice == 2) {
			cThread.setPriority(Thread.MIN_PRIORITY);
			javaThread.setPriority(Thread.MAX_PRIORITY);
			cThread.start();
			javaThread.start();
		}
		sc.close();
	}

}
