package main;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
	
	public static void main(String[] args) {
		
		System.out.println("start");

		Test("abc", 56, 76, 98);
		
		System.out.println(Test.class);
		
		List<Integer> num = Arrays.asList(1, 2);
		
		int sum = num.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println(sum);

	    
		//  intermediate operations and terminal operations in streams
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream()              // Creates a stream
		      .filter(s -> s.startsWith("c"))  // Intermediate operation
		      .map(String::toUpperCase)        // Intermediate operation
		      .sorted()                        // Intermediate operation
		      .forEach(System.out::println);   // Terminal operation
		
		
		//Which is a predefined literal used as a format specifier in printf() to format data of type int?
		
		int number = 123;
		System.out.printf("The number is: %d", number).println();
				
		System.out.println("the num " + number);
		
		System.out.printf("%d + %d + %d = %d", 3, 4, 5, 3 + 4 + 5).println();

		
		// for Loop

		for (int i = 0; i < 5; i++) {
			System.out.println("The value of i is: " + i);
		}

		LeapYearChecker leapyear = new LeapYearChecker();
		int x = 0;
		
		System.out.println("leap year test" + "input is: " + x + " output is: " + leapyear.isLeapYear(x) );
		

	}

	

	// Internal methods


		/*
	 * Coding Exercise: Is Leap Year
You are given a class LeapYearChecker with a method isLeapYear(int year). Your task is to complete the implementation of the method to determine if a given year is a leap year.

The rules are a little tricky. Read them carefully.

A year is a leap year in the Gregorian calendar if:

It is divisible by 4 (AND)

It is NOT divisible by 100 (except when it is divisible by 400)

Not Divisible by 4 - NOT Leap Year (2041)

Divisible by 4 and NOT divisible by 100 - Leap Year (2048)

Divisible by 4 and divisible by 100 - Additional check needed

Divisible by 4, divisible by 100, divisible by 400 - Leap Year (2000, 2400)

Divisible by 4, divisible by 100, NOT divisible by 400 - NOT Leap Year (2100, 2200, 2300)

Instructions

Implement the isLeapYear method to return true if the year is a leap year and false otherwise.

You need to account for the edge case where the year is less than 1. For such a case, the method should return false.

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
       // Implement your code here
    }
}
Please ensure your code passes all the test cases, including edge cases, and adheres to the above guidelines.
	 * 
	 */

	 public static class LeapYearChecker {
		public boolean isLeapYear(int year) {

			
		   return (year > 0) && ((year % 4 == 0) && ( year % 100 > 0) || (year % 400 == 0)) ;
		}
	}



// =============================================================	 

	public static void Test(String name, int... marks) {
		String namex = name;
		ArrayList<Integer> marksx = new ArrayList<Integer>();
		  for (int mark : marks) {
			  marksx.add(mark);
		  }
		  
		}


/*
Coding Exercise: Time Converter

In Java, you have been given a partially implemented TimeConverter class that aims to convert time from hours or days to minutes. The TimeConverter class has two static methods that need to be completed:

convertHoursToMinutes(int hours): This method should take an integer value representing hours and return the equivalent value in minutes.

convertDaysToMinutes(int days): This method should take an integer value representing days and return the equivalent value in minutes.

Instructions

Task 1: Complete the convertHoursToMinutes method in the TimeConverter class so that it accurately converts hours into minutes. The method should return an integer value representing the total number of minutes.

Task 2: Complete the convertDaysToMinutes method in the TimeConverter class so that it accurately converts days into minutes. The method should return an integer value representing the total number of minutes.

NOTE: Return -1 for invalid cases (days and hours less than 0).
 */
	public static class TimeConverter {

		public static int convertHoursToMinutes(int hours) {
			// Your task: complete this method
			
			int mins = 0;
			
			mins = hours * 60;
			
			
			return (mins >= 0) ? mins : -1;
		}
		
		public static int convertDaysToMinutes(int days) {
			// Your task: complete this method
			
			int mins = 0;
			
			mins = days * 24 * 60;
			
			return (mins >= 0) ? mins : -1;
		}
	}

	/*
	 * Coding Exercise: Is Perfect Number
In this exercise, your task is to implement a method in the PerfectNumberChecker class that checks whether a number is a "perfect number".

A Perfect Number is a positive integer that is equal to the sum of all of its positive divisors, excluding itself.

For example, the number 6 is a perfect number because its divisors are 1, 2, and 3. The sum of these divisors is equal to 6, so 6 is a perfect number. Similarly, 28 is also a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        // Write code here
    }
}
Instructions

The isPerfectNumber(int number) method should return true if the number is a perfect number, and false otherwise.

A perfect number is always a positive integer. If the number is zero or a negative number, return false.

You can assume that the input number will always be an integer.
	 */

public static class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        // Write code here
		int sum = 0;

		if (number <= 0) {
			return false;
		}

		for (int i = 1; i < number; i++){
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum == number;
    }
}

/*
 * Coding Exercise: Inches to Object (Feet, Inches)
In this problem, you have to complete the implementation of a Dimension class in Java that represents measurements in feet and inches.

Here is the skeleton of the Dimension class:

public class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // TODO: Convert the total inches into feet and inches. One foot is 12 inches.
        // Store the feet and inches in their respective instance variables.
    }
    
    public int getFeet() {
        // TODO: Return the value of feet.
        return -1;
    }
    
    public int getInches() {
        // TODO: Return the value of inches.
        return -1;
    }    
}
Task

Your task is to implement the Dimension(int inches) constructor and getFeet() & getInches() methods in the Dimension class.

Dimension(int inches) - This constructor will take one parameter, inches (an integer), and it should convert the given inches into feet and inches. If the input inches are less than 0, set feet and inches to -1 to indicate invalid input. One foot is equal to 12 inches.

getFeet() - This method should return the calculated feet from the constructor.

getInches() - This method should return the remaining inches (less than 12) from the constructor.

Examples

Here are some examples of how your Dimension class should behave once implemented:

Dimension dim = new Dimension(25);
System.out.println(dim.getFeet());    // Output: 2
System.out.println(dim.getInches());  // Output: 1
In the above example, 25 inches is equal to 2 feet and 1 inch.

Dimension dim = new Dimension(-1);
System.out.println(dim.getFeet());    // Output: -1
System.out.println(dim.getInches());  // Output: -1
In the above example, -1 inch is an invalid input so both getFeet() and getInches() return -1.

Good luck!
 */

 public static class Dimension {
    private int feet;
    private int inches;
    
    public Dimension(int inches) {
        // Store the feet and inches in their respective instance variables.
		if (inches < 0){
			this.feet = -1;
			this.inches = -1;
		}
		else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}

    }
    
    public int getFeet() {
        
        return this.feet;
    }
    
    public int getInches() {
        
        return this.inches;
    }    
}

/*
 * 
 */

 public class Point {
    
    // x-coordinate of the point
    private int x;

    // y-coordinate of the point
    private int y;

    // Constructor for the Point class
    public Point(int x, int y) {
        this.x = x;  // Assigning x-coordinate of the point
        this.y = y;  // Assigning y-coordinate of the point
    }

    // Method to get the x-coordinate of the point
    public int getX() {
        return x;
    }

    // Method to get the y-coordinate of the point
    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public double distanceTo(Point other) {
        int deltaX = this.x - other.getX();
        int deltaY = this.y - other.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

	public class NumberUtils {

		/**
		 * This method reverses a given integer and returns the reversed number.
		 * If the number is negative, it returns -1 as the reverse of a negative number is undefined.
		 * If the number is zero, it returns 0 as the reverse of 0 is 0.
		 * @param number: an integer
		 * @return reversed number, or -1 if number is negative, or 0 if number is zero.
		 */
		public int reverseNumber(int number) {
			// TODO: Write your code here
			if (number < 0) {
				return -1;
			}


			int times = 0;
			int temp = number;
			while (temp > 0) {
				times += 1;
				temp = temp / 10;
			}


			int result = 0;
			temp = number;
			while (temp > 0) {
				times += -1;
				result = (int) ((temp % 10) * Math.pow(10, times));
				temp = temp / 10;
			}

			return result;
		}
	}

}

