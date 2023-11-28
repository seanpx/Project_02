package main;

import java.util.Scanner;

public class InputOps {

	private static Scanner scanner = new Scanner(System.in);
	private static boolean validInput = false;
	
	public static double getDouble() {
		double varDouble = 0.0;
        String input = " ";
        InputOps.validInput = false;
        
        while (!InputOps.validInput) {
        	input = scanner.nextLine();
            input = input.trim();
            try {
            	varDouble = Double.parseDouble(input);
            	InputOps.validInput = true;
            } catch (NumberFormatException e) {
            	 System.out.print("invalid double, Try again: ");
            }
            
        }
        
		return varDouble;
		
	}
	
	public static String getString() {
		String varString = " ";
        String input = scanner.nextLine();
        input = input.trim();
        varString = input;
        
		return varString;
		
	}
	
	public static char getChar() {
		char varChar = ' ';
        String input = scanner.nextLine();
        input = input.trim();
        varChar = input.charAt(0);
        
		return varChar;
		
	}
	
	
	public static void close() {
		scanner.close();
	}
	
}
