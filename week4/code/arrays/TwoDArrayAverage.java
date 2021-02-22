public class TwoDArrayAverage{
	/*
		Method accepts a 2D array and returns a double
	*/
	public static double getAverage(int[][] a){
		double total 	= 0;
		//outer loop to traverse rows
		for (int row = 0; row < a.length; row++){
			// inner loop to traverse columns
			for (int col = 0; col < a[0].length; col++)
				// access array element and accumulate a total
				total += a[row][col];
		}
		// do math and return the result
		return total / (a.length * a[0].length);
	}

	public static void main(String[] args){
		// decalre and initialize array
		int[][] matrix = { {1,2,3},{4,5,6}};
		// call method and store result locally
		double avg = getAverage(matrix);
		// print the result
		System.out.println("Average is: " + avg);
	}
}
