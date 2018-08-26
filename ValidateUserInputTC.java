package userInputTC;

// InputMismatchException worked with util import
import java.util.*;

public class ValidateUserInputTC 
{

	public static void main(String[] args) 
{
		
	Scanner input = new Scanner(System.in); // within main method, don't need static keyword
		
	int userVal = -1;
	
	while (userVal < 0) 
	{
	
		try 
		{
			
			System.out.println("Please enter a positive integer: ");
			
			userVal = input.nextInt();
		} 
		
		catch (InputMismatchException ex) 
		{
			
			input.next();
		}
	}
	
	// user entered a valid value
	
	System.out.println("user entered: " + userVal);
	System.out.println("Done");
	
	input.close();
	
}

}
