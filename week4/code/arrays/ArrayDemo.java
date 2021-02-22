public class ArrayDemo{

	public static void main(String[] args){
		//declare an array variable
		int[] highScores;
		// create the array
		highScores = new int[5];
		// declare and create array in 1 step!
		String[] names = new String[5];

		int[ ] scores = {99,98,98,88,68};
		String[ ] students = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};

		System.out.println(scores.length);

		// assign a new value 99 to the first element in the array
		scores[0] = 99;
		// print the first element of the array
		System.out.println( scores[0] );
	}
}
