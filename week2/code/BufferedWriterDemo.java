/*
    This program demonstrates writing to a file using the BufferedWriter class
    If you anticiapte many small writes (such as loop with write()) you can gain efficiency 
    by buffering the writes. This reduces the number of times the OS has to actually
    write to the file.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterDemo{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to name the file? ");
        String fileName = scanner.next();

        scanner.skip("\n");  // next() leaves the '\n'. Skip it

        System.out.print("\nType some data to add to " + fileName + " and press enter when done: ");
        String data = scanner.nextLine();

        try{ 
            FileWriter fileWriter = new FileWriter(fileName);       // create a FileWriter
            BufferedWriter buffer = new BufferedWriter(fileWriter); // buffer the FileWriter
            buffer.write(data); // write the data
            buffer.flush();     // flush the buffer
            buffer.close();     // close the buffer
        }catch(IOException ioe){
            System.out.println("Something bad happened with the file");
        }
        scanner.close();        // close the Scanner   
    }
}
