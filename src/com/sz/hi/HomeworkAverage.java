package com.sz.hi;

import com.sz.hi.util.ConsoleInput;

public class HomeworkAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleInput consoleInput = new ConsoleInput();
		int counter = 1;
		double sum = 0;
		double average = 0;
		
		while (counter<6) {
			System.out.println("Please input a number: ");
			String number = consoleInput.read();
			try {
				int n = Integer.parseInt(number);
				sum = sum + n;
				counter = counter + 1;
				System.out.println();
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println();
				counter = counter + 1;
		   	
			}
			
		}
	average = sum/(counter-1);
	System.out.println("The average of the numbers you input is " + average );
	}

}
