package com.sz.hi;

import com.sz.hi.util.ConsoleInput;

public class FirstClass718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInput consoleInput = new ConsoleInput();
		
//		String name = consoleInput.read();
//		
//		System.out.println("Hello " + name);
//		System.out.println();
		
			int counter =1;
//		while (counter < 10) {
//			String name = consoleInput.read();
//			System.out.println("Hello " + name);
//			System.out.println();
//			counter = counter + 1;
		
			while (counter < 10) {
				System.out.println("Please input a number: ");
				String number = consoleInput.read();
				try {
					int n = Integer.parseInt(number);
					System.out.println("The square of " + n + " is " + n * n);
					System.out.println();
					
					counter = counter + 1;
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
			}
		
		}			
		
	}

}
