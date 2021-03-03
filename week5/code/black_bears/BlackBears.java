import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class BlackBears{
    final static int NUM_REGIONS   = 7;
    final static int NUM_MONTHS    = 12;
    public static void main(String[] args){

        String      fileName    = "";
        // 2D array to model the table
        int[][]     sightings   = new int[NUM_REGIONS][NUM_MONTHS];
        // array to make mongth display nice and easy
        String[]    months      = { "January", "February", "March", "April", "May",
                                    "June", "July", "August", "September", "October",
                                    "November", "December"};
        
        // get out early if we can
        if(args.length  < 1){
            System.out.println("NO FILE SPECIFIED. ABORTING");
            return;
        }

        // args passed in, continue on.

        fileName = args[0];             // grab the file name from command line args
        fillArray(sightings, fileName); // call fillArray
        // compute average per month
        // COLUMN MAJOR ORDER
        for(int i = 0; i < NUM_MONTHS; ++i){
            double sum = 0.0;
            for(int j = 0; j < NUM_REGIONS; ++j)
                sum += sightings[j][i];
            System.out.printf("Average for %s:\t %.2f \n", months[i], sum / NUM_REGIONS);
        }

        System.out.println("\n");

        // compute average per region
        // ROW MAJOR ORDER
        for(int i = 0; i < NUM_REGIONS; ++i){
            double sum = 0;
            for(int j = 0; j < NUM_MONTHS; ++j)
                sum += sightings[i][j];
            System.out.printf("Average for Region %d:\t %.2f \n", i+1, sum / NUM_MONTHS);
        }
    }// end of main

    // method to fill array from file
    public static void fillArray(int[][] array, String fileName){
        try{
            File fr   = new File(fileName);
            Scanner scanner = new Scanner(fr);

            // load the table with the sightings data
            for(int i = 0; i < NUM_REGIONS; i++){
                String line     = scanner.nextLine();
                String[] values = line.split(",");
                for(int j = 0; j < NUM_MONTHS; ++j)
                    array[i][j] = Integer.parseInt(values[j]);
            } // end outer for
            scanner.close();
        } // end try
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
} // end of class
