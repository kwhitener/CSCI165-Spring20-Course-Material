import java.util.Scanner;
import java.util.InputMismatchException;

public class MonthStringArray{
	public static void main(String[] args){
		// use an array to store the months
		String[] months = {"January", "February", "March", "April", "May", "June",
						   "July", "August", "September", "October", "November",
						   "December"};
		// create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		// prompt for month number
		try{
			System.out.print("Enter the month number {1 - 12}: ");
			// try to read an integer using nextInt
			// this will throw an InputMismatchException if input is not an integer
			int month = keyboard.nextInt();
			// make sure the number is within range
			if(month >= 1 && month <= 12){
				// Have to subtract 1 because array indexing is zero based
				// January -> 0, February -> 1 . . . etc
				String monthString = months[month - 1];
				System.out.println("You chose: " + monthString);
			}else
				System.out.println("There is no month: " + month);

			keyboard.close() // close Scanner
		}catch (InputMismatchException ie){
			System.out.println("The input was entered in incorrect format. Aborting program");
		} // end catch
	} // end main
} // end class
