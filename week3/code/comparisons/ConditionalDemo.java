public class ConditionalDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        bool condition1, condition2, condition3, condition1_1, condition1_2;

        if(condition1){
            // code block will execute if condition is true
            // multiple statements must be contained in { }
            if(condition1_1){
                // code block will execute if condition1 is true
                // and condition1_1 is true
                if(condition1_1_1){
                    // code block will execute if condition1 is true
                    // and condition1_1 is true
                    // and condition1_1_1 is true
                }   // end second level nesting
            }   // end condition 1_1 if
            else if(condition1_2){
                // code block will execute if condition1 is true
                // and condition1_1 is false
                // and condition 1_2 is true
            }   // end condition1_2 if
            else{
                // code block will execute if condition1 is true
                // and condition1_1 is false
                // and condition1_2 is false                
            }   // end nested else
        
        } //end condition1 if
        else if(condition2){
            // code block will execute if condition1 is false
            // and condition2 is true

        } // end else if
        else if(condition3){
            //code block will execute if conditions 1 and 2 are false
            // and condition3 is true

        } // end else if
        else{
            // code block will execute if conditions 1, 2 and 3 are false

        } // end else



    }




}
