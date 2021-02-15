import java.util.InputMismatchException;

public class ComparisonDemo2 {

    public static void main(String[] args){
        int val1 = 1;
        int val2 = 2;

        // do we have command line args? If so use those
        if(args.length == 2){
            // args are Strings and must be converted. The data may not be proper integers, so use try/catch
            try{
                // use the static method parseInt from the Integer class to convert
                val1 = Integer.parseInt(args[0]);
                val2 = Integer.parseInt(args[1]);
            }catch(InputMismatchException ime){
                System.out.println("There was a problem with the command line args. Using literals instead");
            }
        }

        // are they equal?
        if(val1 == val2){
            System.out.println(val1 + " == " + val2);
            System.out.println("Only use == on primitive values");
            System.out.println("Use { } if code block contains multiple lines.");
            System.out.println("Otherwise the { } are optional");
        }
        if(val1 != val2)
            // no { } required here. Only a single line of code in the block
            System.out.println( val1 + " does not equal " + val2);
        if(val1 > val2)
            System.out.println(val1 + " is larger than " + val2);
        if(val1 < val2)
            System.out.println(val1 + " is smaller than " + val2);
        if(val1 <= val2)
            System.out.println(val1 + " is smaller than or equal to " + val2);
    }
}
