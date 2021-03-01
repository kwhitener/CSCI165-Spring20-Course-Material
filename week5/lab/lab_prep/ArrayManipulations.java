public class ArrayManipulations {

    public static void main(String[] args) {
        //define an array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //rotateOnce(myArray);
        rotateN(myArray, 5);
        
        printArray(myArray);
    }

    /**
     * prints an array of integers on one line
     * @param array the array to print
     * @return nothing
     */
    public static void printArray(int[] array){
        for(int element : array)                // use an enhanced for loop. Do not need an index
            System.out.print(element + " ");    // use "print" to avoid the line break
        System.out.println();                    // end with a line break
    }

    /**
     * Will rotate an array right by one place
     * @param array the array to rotate
     * @return nothing
     */
    public static void rotateOnce(int[] array){
        int len  = array.length;    // alias the length to save typing
        int temp = array[len - 1];  // hold the last item

        // iterate backwards through array, moving each item up one index at a time
        for(int index = len - 1; index > 0; --index)
            array[index] = array[index - 1];

        array[0] = temp; // put orignal last item at the beginning
    }

    /**
     * Rotates an array N times by repeatedly calling rotateOnce 
     * @param array the array to rotate
     * @param N the number of times to rotate
     * @return nothing. Array will be manipulated by address 
     */
    public static void rotateN(int[] array, int N){
        for(int count = 1; count <= N; ++count) // iterate N number of times
            rotateOnce(array);                  // call rotateOnce for each rotation
    }

    /**
     * Search the array for a soecified element
     * @param array the array to search
     * @param elementToFind the element to search for
     * @return the index of the found element, or -1 if not found
     */
    public static int find(int[] array, int elementToFind){
        // use a for loop because we need the index. 
        for(int index = 0; index < array.length; ++index)
            if(elementToFind == array[index])   // test item
                return index;                   // if they are equal, return the index
        return -1;                              // if you make it here, return -1. Item not found
    }

    /**
     * 
     * @param array         array to split
     * @param firstHalf     will copy lower split to here
     * @param secondHalf    will copy upper split to here
     * @param splitPoint    will split the array here
     */
    public static void splitAt(int[] array, int[] firstHalf, int[] secondHalf, int splitPoint){
        
        int locationOfSplit = find(array, splitPoint);          // use find to locate the split position
        if(locationOfSplit == -1)                               // did we find it?
            return;                                             // split value not found. Get out.
        
        for(int index = 0; index < locationOfSplit; ++index)    // copy lower half, use location from above
            firstHalf[index] = array[index];
        
        for(int index = locationOfSplit + 1; index < array.length; ++index) // copy upper half, use location from above
            secondHalf[index-(locationOfSplit+1)] = array[index];

        return;
    }
    
}
