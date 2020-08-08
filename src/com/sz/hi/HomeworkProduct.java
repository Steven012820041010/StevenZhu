package com.sz.hi;

import com.sz.hi.util.ConsoleInput;

public class HomeworkProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInput consoleInput = new ConsoleInput();
		int counter = 1;
		int sum = 0;
		
		while(counter < 6) {
			System.out.println("Please input a number: ");
			String number = consoleInput.read();
			try {
				int n = Integer.parseInt(number);
				counter = counter + 1;
				sum = sum + n*n;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
				counter = counter + 1;
			}
		}
	System.out.println("The final sum is " + sum);
	}

}
