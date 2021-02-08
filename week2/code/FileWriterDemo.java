/*
    This program demonstrates writing to a file using the FileWriter class
    FileWriter hands the write call over to the OS. The OS will perfrom the write
    when it gets to it. You can force the write by calling flush() or close()

    User input will be gathered using a Scanner, and written to a text file
*/

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class FileWriterDemo{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to name the file? ");
        String fileName = scanner.next();

        scanner.skip("\n");  // next() leaves the '\n'. Skip it, or the call to nextLine will fail

        System.out.print("\nType some data to add to " + fileName + " and press enter when done: ");
        String data = scanner.nextLine();

        // instantiation of the FileWriter may throw an IOException, must be try/caught
        try {
            FileWriter fileWriter = new FileWriter(fileName);  // instantiate FileWriter
            fileWriter.write(data);             // writes to internal buffer
            fileWriter.close();                 // closes writer, calling flush()
        } catch (IOException e) {
            System.out.println("There was a problem writing to the file");
        }

        scanner.close(); 
    }
}




