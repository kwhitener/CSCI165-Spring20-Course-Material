public class LoopingDemo{

    public static void main(String[] args){
        /*
        int n = 10;
        while(n > 0){
            System.out.println(n);
            n--;
        }
        System.out.println("Blastoff!");
        */
        
        int n = 30;
        System.out.print("Halistone sequence for " + n + ": ");
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
        }
        System.out.println(n+"\n");
        
    
        n = 1;
        while (n < 10) {
            System.out.printf("%d => %f \n", n, Math.log(n));
            n++;
        }
    
        /*
        int n = 1;      // counter for outer loop
        int i = 1;      // counter for inner loop
        int limit = 12; // compute up to here
        
        // outer loop
        while (i < limit){
            // inner loop
            while (n <= limit) {
                System.out.printf("%4d", n * i);
                n++;
            } // end inner loop
            n = 1;                  // reset n
            System.out.println();   // print a line break
            i++;                    // increment i
        } // end outer loop
        */
        
    } // end main
} // end class
