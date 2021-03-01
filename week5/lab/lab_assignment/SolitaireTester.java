public class SolitaireTester {
    
    public static void main(String[] args) {
        // call testing methods
        testExchangeAJoker();
        System.out.println();
        testExchangeBJoker();
    }

    public static void testExchangeAJoker(){
        // TEST CASES

        //int[] deck      = {1,2,3,4,5,6,7,27,8,9,10};            // deck to test
        //int[] expected  = {1,2,3,4,5,6,7,8,27,9,10};            // expected results

        //int[] deck      = {1,2,3,4,5,6,7,8,9,10,27};            // deck to test
        //int[] expected  = {27,2,3,4,5,6,7,8,9,10,1};            // expected results

        //int[] deck      = {27,1,2,3,4,5,6,7,8,9,10};            // deck to test
        //int[] expected  = {1,27,2,3,4,5,6,7,8,9,10};            // expected results

        int[] deck      = {1,2,27,3,4,5,6,7,8,9,10};            // deck to test
        int[] expected  = {1,2,3,27,4,5,6,7,8,9,10};            // expected results

        // print original deck
        System.out.print("ORIGINAL DECK: ");
        printArray(deck);

        SolitaireCipher.exchangeAJoker(deck);                   // call method to test

        if(equalArrays(deck, expected))                         // call helper to check results
            System.out.println("\nexchangeAJoker: TEST PASSED!");
        else
            System.out.println("\nexchangeAJoker: TEST FAILED");

        // show results
        System.out.print("RESULT: ");
        printArray(deck);
        System.out.print("\nEXPECTED RESULT: ");
        printArray(expected);
    }

    public static void testExchangeBJoker(){
        // TEST CASES

        //int[] deck      = {1,2,3,28,4,5,6,7,8,9,10};            // deck to test
        //int[] expected  = {1,2,3,4,5,28,6,7,8,9,10};            // expected results

        //int[] deck      = {1,2,3,4,5,6,7,8,28,9,10};            // deck to test
        //int[] expected  = {1,2,3,4,5,6,7,8,9,10,28};            // expected results

        //int[] deck      = {1,2,3,4,5,6,7,8,9,28,10};            // deck to test
        //int[] expected  = {28,2,3,4,5,6,7,8,9,10,1};            // expected results

        int[] deck      = {1,2,3,4,5,6,7,8,9,10,28};            // deck to test
        int[] expected  = {2,28,3,4,5,6,7,8,9,10,1};            // expected results

        // print original deck
        System.out.print("\nORIGINAL DECK: ");
        printArray(deck);

        SolitaireCipher.exchangeBJoker(deck);                   // call method to test

        if(equalArrays(deck, expected))                         // call helper to check results
            System.out.println("\nexchangeBJoker: TEST PASSED!");
        else
            System.out.println("\nexchangeBJoker: TEST FAILED");

        // show results
        System.out.print("RESULT: ");
        printArray(deck);
        System.out.print("\nEXPECTED RESULT: ");
        printArray(expected);
    }

    // HELPERS. Define any helper methods below here

    /**
     * Compares two arrays for equality, enforcing order
     * @param one
     * @param two
     * @return
     */
    public static boolean equalArrays(int[] one, int[] two){
        if(one.length != two.length)                    // not the same length?
            return false;                               // get out early

        for(int index = 0; index < one.length; ++index) // iterate through both arrays
            if(one[index] != two[index])                // compare item by item
                return false;                           // items aren't equal return false

        return true;                                    // made it here? Guaranteed equal
    }

    /**
     * prints an array on a single line, items separated by spaces
     * @param array
     */
    public static void printArray(int[] array){
        for(int element : array)                        // use an enhanced for loop. Do not need an index
            System.out.print(element + " ");            // use "print" to avoid the line break
    }
}
