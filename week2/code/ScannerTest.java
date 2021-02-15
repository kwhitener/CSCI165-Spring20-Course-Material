import java.util.Scanner;

public class ScannerTest{

    public static void main(String[] args) {
        String line;                                  // variable to hold the input
        Scanner input = new Scanner(System.in);         // instantiate Scanner object
        /*
        System.out.print("Enter your first name: ");    // prompt for input
        line = input.next();                            // ask Scanner to give you next token
        System.out.print("Enter your last name: ");
        line += " " + input.next();                     // get next token and add to the line variable

        System.out.println("Hello " + line + ". Thank you for trying the Scanner out");
        
        
        System.out.println("Enter some data separated by spaces: ");
        int     i = input.nextInt();
        String  c = input.next();
        double  d = input.nextDouble();

        System.out.println("You entered: " + i + ", " + c + " and "  + d);

        System.out.println("Here is what is left: " + input.next());
        
        
        //System.out.print("Enter as much text as you like. Press Enter when finished: ");
        line = input.nextLine();
        System.out.println("You entered: " + line);
    
    
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("What is your age? ");
        int age = input.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);
        */

    
        System.out.print("What is your age? ");
        int age = input.nextInt();  // leaves a line separator in the stream
        //input.skip("\r\n");   // have the scanner skip windows CR LF
        input.nextLine();       // just consume the CR LF and discard
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    
    
        input.close();                                  // close the Scanner IMPORTANT!!
    }
}




