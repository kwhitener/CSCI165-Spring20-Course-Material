import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StringArray{
	public static void main(String[] args) {
		// create an array of 10 String objects
		String[] names = new String[10];
		// call readNames method and pass the array
		readNames(names);
		// now try to print again
		for (String name : names)
			System.out.println(name);

		// call printInitials
		printInitials(names);
	}

	public static void readNames(String[] n){
		try{
			File text = new File("names.txt");		// create a File instance
			Scanner fileReader = new Scanner(text); // create a Scanner instance

			int index = 0;							// variable to track the array index
			while (fileReader.hasNext()){			// as long as there is more to read
				n[index] = fileReader.nextLine();	// read the entire line
				++index;							// increment the index
			}
			fileReader.close(); 					// close the scanner
		}
		catch(FileNotFoundException fnfe){
			System.out.println("There was a problem with the file");
		}
	}

	public static void printInitials(String[] n){

		// iterate through the array. Use an explicit for loop to show the mechanics
		for (int index = 0; index < n.length; ++index){
			// get first character of first name
			char first = n[index].charAt(0);
			// find the space
			int spaceIndex = n[index].indexOf(" ");
			// use space to get first character of last name
			char last = n[index].charAt(spaceIndex + 1);
			// print the results
			System.out.println(n[index] + "'s initials are: " + String.valueOf(first) + String.valueOf(last));
		}
	}
}
