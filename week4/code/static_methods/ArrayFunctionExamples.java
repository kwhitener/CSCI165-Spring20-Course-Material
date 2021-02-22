import java.util.Scanner;
import java.util.Arrays;

public class ArrayFunctionExamples {

    public static void main(String[] args) {

        // 1) call mean
        double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double m = mean(values);
        System.out.println("\n1) The mean of: " + Arrays.toString(values) + " is: " + m);

        // 2) call exchange
        String[] bands = {"Urgehal", "Tsjuder", "Cultes des Goules", "Horna", "Mayhem", "Darkthrone", "Arckanum"};
        System.out.println("\n2) Before exchange: " + Arrays.toString(bands));
        exchange(bands, 0, bands.length - 1);
        System.out.println("After exchange: " + Arrays.toString(bands));

        // 3) Call shuffle
        System.out.println("\n3) Before shuffle: " + Arrays.toString(bands));
        shuffle(bands);
        System.out.println("After shuffle: " + Arrays.toString(bands));

        // 4) call dot
        double[] set_one = {1, 2, 3, 4, 5};
        double[] set_two = {6, 7, 8, 9, 10};
        double dot_product = dot(set_one, set_two);
        System.out.println("\n4) The dot product of: " + Arrays.toString(set_one) + " x " + Arrays.toString(set_two) + " is: " + dot_product + "\n");

        // 5) call print array with matrix
        double[][] matrix = {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {8, 10, 11, 12},
                                {13, 14, 15, 16}
                            };
        printArray(matrix);

    }


    // returns the mean of the array
    public static double mean(double[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return sum / a.length;
    }

    // swaps array elements i and j
    public static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // returns a random integer between 0 and n-1
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    // take as input an array of strings and rearrange them in random order
    public static void shuffle(String[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n-i);   // between i and n-1
            exchange(a, i, r);
        }
    }

    // returns the dot product of a[] and b[]
    /*
        In mathematics, the dot product or scalar product is an algebraic operation 
        that takes two equal-length sequences of numbers and returns a single number.
    */
    public static double dot(double[] a, double[] b) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i] * b[i];
        return sum;
    }

    // prints a one-dimensional array and its length
    public static void printArray(double[] a) {
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    // prints a two-dimensional array and its dimensions
    public static void printArray(double[][] a){
        System.out.println("ROWS: " + a.length + " COLS: " + a[0].length);
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
    }

    // reads a two-dimensional array from standard input
    public static double[][] fill2DArray() {
        Scanner keyboard = new Scanner(System.in);

        // ask for array dimensions
        System.out.println("Enter number of rows: ");
        int m = keyboard.nextInt();
        System.out.println("Enter number of columns: ");
        int n = keyboard.nextInt();

        // create array from input dimensions
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++){
                System.out.println("Enter value for [" + i + "][" + j + "]:");
                a[i][j] = keyboard.nextDouble();
            }
        return a;
    }


}
