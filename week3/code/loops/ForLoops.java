public class ForLoops{
    
    public static void main(String[] args){
        /*
        int limit = 5;

        if(args.length > 0){
            try{
                limit = Integer.parseInt(args[0]);
            }catch(NumberFormatException nfe){
                System.out.println("Invalid argument type. Using: " + limit);
            } // end catch
        } // end if

        System.out.println();

        for(int i = 1; i <= limit; ++i){
            for(int j = 1; j <= limit; ++j)
                System.out.printf("%4d", j * i);
            System.out.println();
        }// end outer for

        System.out.println();
        */

        /*
        int count   = 0;
        String text = "Shamash";

        // use command line args if present
        if(args.length > 0)
            text = args[0];

        // turn the String object into a primitive array of type char
        char[] letters = text.toCharArray(); 

        for(int index = 0; index < letters.length; ++index){
            if(letters[index] == 'a')
                count++;
        }
        System.out.println("There are " + count + " 'a' letters in: " + text);
        */


        int count   = 0;
        String text = "Shamash";

        // use command line args if present
        if(args.length > 0)
            text = args[0];
        // use the length of the String to control the loop
        for(int index = 0; index < text.length(); ++index){
            // String elements are primitive chars
            char letter = text.charAt(index);
            if(letter == 'a')
                count++;
        }// end for

        System.out.println("There are " + count + " 'a' letters in: " + text);

    }// end main
}// end class
