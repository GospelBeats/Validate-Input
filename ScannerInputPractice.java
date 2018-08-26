package userInputTC;

// notice this import works with Scanner
import java.util.*;

public class ScannerInputPractice {
	
	// notice outside the main method with static keyword
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Tell me your name please. "); // ask question first

	String name = input.nextLine(); // if next word - next(); if entire String nextLine()
	
	System.out.println("Please tell me your age. ");
	
	int age = input.nextInt();
	
	System.out.println("Please tell me your height. ");
	
	double height = input.nextDouble();
	
	System.out.println("Your name is " + name + "\nYour age is " + age + "\nYour height is " + height);
	
	
	}

}
