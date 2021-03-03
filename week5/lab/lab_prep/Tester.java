
public class Tester {

    public static void main(String[] args) { 
        testRotateOnce();
        System.out.println();
        testRotateN();
        System.out.println();
        testFind();
        System.out.println();
        testSplitAt();
        System.out.println();
        testEqualsFalse();
        System.out.println();
        testEqualsTrue();
    }

    public static void testEqualsTrue(){
        //TEST CASES
        //int[] one = {1,2,3,4,5,6,7,8,9,10};
        //int[] two = {1,2,3,4,5,6,7,8,9,10};

        int[] one = {10,9,8,7,6,5,4,3,2,1};
        int[] two = {10,9,8,7,6,5,4,3,2,1};

        if(equals(one, two))
            System.out.println("\nequals TRUE: TEST PASSED!");
        else
            System.out.println("\nequals TRUE: TEST FAILED");

        // show results
        System.out.print("RESULT: \n");
        printArray(one);
        printArray(two);
        
    }

    public static void testEqualsFalse(){
        // TEST CASES
        //int[] one = {1,2,3,4,6,5,7,8,9,10};
        //int[] two = {1,2,3,4,5,6,7,8,9,10};

        int[] one = {1,3,2,4,6,5,7,8,9,10};
        int[] two = {1,2,3,4,5,6,7,8,9,10};

        if(equals(one, two))
            System.out.println("\nequals FALSE: TEST FAILED!");
        else
            System.out.println("\nequals FALSE: TEST PASSED");

        // show results
        System.out.print("RESULT: \n");
        printArray(one);
        printArray(two);
        
    }

    public static void testRotateOnce(){
        // TEST CASES
        //int[] array          = {1,2,3,4,5,6,7,8,9,10};  // array to test
        //int[] expectedResult = {10,1,2,3,4,5,6,7,8,9};  // array rotated right one place

        
        // call method to test
        ArrayManipulations.rotateOnce(array);

        // test actual results against expected results
        if(equals(array, expectedResult))
            System.out.println("\nrotateOnce: TEST PASSED!");
        else
            System.out.println("\nrotateOnce: TEST FAILED");

        // show results
        System.out.print("RESULT: ");
        printArray(array);
        System.out.print("EXPECTED RESULT: ");
        printArray(expectedResult);
    }

    public static void testRotateN(){
        // TEST CASES
        int[] array          = {1,2,3,4,5,6,7,8,9,10};  // array to test
        int[] expectedResult = {6,7,8,9,10,1,2,3,4,5};  // array rotated right one place

        // call method to test
        ArrayManipulations.rotateN(array,5);

        // test actual results against expected results
        if(equals(array, expectedResult))
            System.out.println("\nrotateN: TEST PASSED!");
        else
            System.out.println("\nrotateN: TEST FAILED");

        // show results
        System.out.print("RESULT: ");
        printArray(array);
        System.out.print("EXPECTED RESULT: ");
        printArray(expectedResult);
    } 

    public static void testFind(){
        // TEST CASES
        int[] array         = {1,2,3,4,5,6,7,8,9,10};   // array to test
        int expectedResult  = 4;                        // going to search for 5

        // call method to test
        int result = ArrayManipulations.find(array, 5);

        // test actual results against expected results
        if(result == expectedResult)
            System.out.println("\nfind: TEST PASSED!");
        else
            System.out.println("\nfind: TEST FAILED");

        // show results
        System.out.print("RESULT: Searching array for 5\n");
        printArray(array);
        System.out.println("METHOD RETURNED: " + result);
        System.out.print("EXPECTED RESULT: " + expectedResult);
    }    

    public static void testSplitAt(){
        int[] array             = {1,2,3,4,5,6,7,8,9,10};   // array to split
        int splitAtItem         = 3;                        // split at this value
        int[] expectedLowHalf   = {1,2,0,0,0,0,0,0,0,0};    // expectations
        int[] expectedHighHalf  = {4,5,6,7,8,9,10,0,0,0};   // expectations

        int[] lower = new int[array.length];    // array to store the result of method call
        int[] upper = new int[array.length];    // array to store the result of method call

        /*
        ArrayManipulations.splitAt(array, lower, upper, splitAtItem);
        printArray(lower);
        printArray(upper);
        */
    }

    // HELPERS

    public static int[] populateArray(int N){
        int[] temp  = new int[N];                       // create an array of size N
        for(int i = 0; i < N; ++i)                      // loop until N
            temp[i] = i + 1;                            // sequential values 1 . . . N
        return temp;                                    // return the array
    }

    public static boolean equals(int[] one, int[] two){
        if(one.length != two.length)                    // not the same length?
            return false;                               // get out early

        for(int index = 0; index < one.length; ++index) // iterate through both arrays
            if(one[index] != two[index])                // compare item by item
                return false;                           // items aren't equal return false

        return true;                                    // made it here? Guaranteed equal
    }

    public static void printArray(int[] array){
        for(int element : array)                        // use an enhanced for loop. Do not need an index
            System.out.print(element + " ");            // use "print" to avoid the line break
        System.out.println();
    }
}
