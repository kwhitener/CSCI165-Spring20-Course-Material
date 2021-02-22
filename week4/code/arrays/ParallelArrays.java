/*
	Program illustrates the concept of parallel arrays.
	Names, prices and quantities will be read from a file.
	The file data is separated by tabs.
	The program will then output the data in tabular format
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParallelArrays{

	public static void main(String[] args){
		// define constant for array size
		final int SIZE = 10;
		// define the parallel arrays
		String[] products 	= new String[SIZE];
		double[] prices		= new double[SIZE];
		int[] quantities	= new int[SIZE];

		fillArrays(products, prices, quantities);			// call fillArrays
		double[] revenue = getRevenue(prices, quantities);  // call getRevenue
		printArrays(products, prices, quantities, revenue);			// call printArrays

	}

	public static void fillArrays(String[] prod, double[] price, int[] quan){
		try{
			// create a File instance
			File file = new File("products.txt");
			// create a Scanner instance associated with the file created above
			Scanner fileInput = new Scanner(file);
			// track the index for each "row" in the parallel arrays
			int index = 0;
			// continue as long as there is more data to read
			while(fileInput.hasNext()){
				// read a complete line, up to new line character
				String line = fileInput.nextLine();
				// split line at tabs into a String array, numbers will need to be converted
				String[] items = line.split("\t");
				// place items into parallel arrays
				prod[index] 	= items[0]; // product name is at index 0 of "items"
				price[index]	= Double.parseDouble(items[1]); // price is at index 1 of "items". Must be converted
				quan[index]		= Integer.parseInt(items[2]); // quantity is at index 2 of "items". Must be converted
				// advance index variable
				index++;
			}
			fileInput.close(); // close Scanner
		}catch(FileNotFoundException fne){
			// this will execute if there is a problem opening the file
			System.out.println("There was a problem opening the file");
		} // end catch
	} // end fillArrays

	public static double[] getRevenue(double[] price, int[] quan){
		// create a new array based on the length of the parameter arrays
		double[] revenue = new double[price.length];
		// for loop through the arrays
		for(int index = 0; index < price.length; ++index){
			// calculate revenue for a product
			revenue[index] = price[index] * quan[index];
		}
		// kick the new local array back to the calling environment
		return revenue;
	}

	public static void printArrays(String[] prod, double[] price, int[] quan, double[] rev){
		// print the header
		System.out.printf("%-35s %-10s %-10s %-10s %n", "PRODUCT", "PRICE", "QUANTITY", "REVENUE");
		for(int index = 0; index < prod.length; ++index){
			// print a single row
			System.out.printf("%-35s $%-10.2f %-10d $%-10.2f %n", prod[index], price[index], quan[index], rev[index]);
		} // end for loop
	} // end printArrays
} // end class
