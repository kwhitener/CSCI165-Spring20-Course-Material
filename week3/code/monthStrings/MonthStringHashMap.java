import java.util.HashMap;
import java.util.InputMismatchException;

public class MonthStringHashMap{

	public static void main(String[] args){

		// create a HashMap with integer keys and String values
		// a HashMap is analgous to Python dictionaries
		// Need to use the Integer class instead of primitive int
		HashMap<Integer, String> months = new HashMap<Integer, String>();

		// add the month numbers and months to the map
		// because keys are 1 based, there is no need to subtract 1 when
		// extracting the month
		months.put(1, "January");
		months.put(2, "February");
		months.put(3, "March");
		months.put(4, "April");
		months.put(5, "May");
		months.put(6, "June");
		months.put(7, "July");
		months.put(8, "August");
		months.put(9, "September");
		months.put(10, "October");
		months.put(11, "November");
		months.put(12, "December");

		// use command line arguments
		if(args.length > 0){
			try{
				// attempt to onvert command line argument to an int
				// InputMismatchException will be thrown if this fails
				int monthNumber = Integer.parseInt(args[0]);
				// is the input within range?
				if(monthNumber >= 0 && monthNumber <= months.size()){
					// use the get method to retrieve the month string
					// we don't need to subtract 1 here due to our keys starting at 1
					String monthString = months.get(monthNumber);
					System.out.println("You chose: " + monthString);
				}else
					System.out.println("There is no month: " + monthNumber);

			}catch(InputMismatchException ime){
				System.out.println("The input was entered in incorrect format. Aborting program");
			} // end catch
		} // end if
	} // end main
} // end class
