public class ArrayDemo{

	public static void main(String[] args){

		int[] highScores;					// declare an array variable
		highScores = new int[5];			// create the array

		String[] names = new String[5]; 	// declare and create array in 1 step!

		int[ ] scores 		= {99,98,98,88,68};	// use an initializer list
		String[ ] students 	= {"Jamal Smith", "Emily Dickinson",
							  "Destiny Jones", "Mateo Mattius",
							  "Sofia Darnlucky"};

		System.out.println(scores.length);	// ask the array for its length

		scores[0] = 99;						// assign a new value 99 to the first element in the array
		System.out.println( scores[0] );	// print the first element of the array

		printParallelArrays(students, scores);
		int s = smallest(scores);
		update(scores);
	}

	public static int largest(int[] array){
		int large = array[0]; // initialize to first element
		// use an enhanced for loop for fun
		// don't need an explicit index for this problem
		for(int number : array){
			if(number > large)
				large = number;
		}
		return large;
	}

	public static int smallest(int[] array) {
		int small = array[0]; // initialize to first element
		// use an enhanced for loop for fun
		// don't need an explicit index for this problem
		for (int number : array) {
			if (number < small)
				small = number;
		}
		return small;
	}

	public static int range(int[] array){
		int smallest = smallest(array);		// already know how to find the smallest
		int largest  = largest(array);		// already know how to find the largest
		int range 	 = largest - smallest;	// simple subtraction
		return range;						// return the result
	}

	public static void update(int[] array){
		// method is void because we can modify the original array through
		// reference that was passed to the method
		// need an explicit index to modify the primitive
		for(int index = 0; index < array.length; ++index)
			array[index] *= .10;
	}

	public static boolean arraysEqual(int[] one, int[] two){
		// get out early if we can
		if(one == two) 				// do references point to the same array?
			return true;			// if so, they are obviously equal
		if(one.length != two.length)// are arrays the same length?
			return false;			// if not, GTFO

		// if we make it here what do we know?
		// 	1) The arrays are distinct collections
		// 	2) They have the same length
		// It's ok to iterate through both with the same index
		// can't use enhanced for loop because we need to index both arrays
		for(int index = 0; index < one.length; ++index)
			if(one[index] != two[index])	// pessimistic testing, are any two not equal?
				return false;				// if so return false

		// if you make it here, you KNOW that all elements are equal
		return true;
	}

	public static void printParallelArrays(String[] names, int[] scores){
		if(names.length != scores.length){	// test size
			System.out.println("Arrays aren't parallel. One is larger");
			return;
		}

		// need an explicit index here
		for(int index = 0; index < names.length; ++index){
			// demonstrates calling a method on an object inside an array
			char firstInitial = names[index].charAt(0);
			char lastInitial  = names[index].charAt(names[index].indexOf(" ") + 1);

			System.out.printf("%c%c has a score of %d\n", firstInitial, lastInitial, scores[index]);
		}
	}
}
