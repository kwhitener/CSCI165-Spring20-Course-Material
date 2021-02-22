public class TwoDArrayTraversal {
	
	public static void main(String[] args) {
		// decalare and initialize a 2D array of ints
		int[][] array = {
				{1,2,3,4},
				{5,6,7,8}
			};

		// outer loop to traverse the number of "rows"
		for (int row = 0; row < array.length; row++){
			// print a row header
			System.out.print("Row " + (row + 1) + ": ");
			// inner loop to traverse the number of "columns"
			for (int col = 0; col < array[0].length; col++)
				// print a single item without line break
				System.out.print( array[row][col] + " " );
			// print a line break
			System.out.println();
		} // end outer loop
	} // end main
} // end class
