import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountPairsInFile{

    public static void main(String[] args){
        String fileName = "";
        String line     = "";
        int count       = 0;

        if(args.length > 0){
            fileName = args[0];
        
            try{
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                // while loop will be terminated internally
                while(true){
                    line = br.readLine();
                    if(line == null) break;
                    // loop through line counting pairs
                    // more efficient than reading characters with the BufferedReader
                    char[] chars = line.toCharArray();
                    for(int index = 0; index < chars.length - 1; ++index){
                        if(chars[index] == chars[index + 1]) count++;
                    }
                }
            }catch(IOException ioe){
                System.out.println("There was something wrong with the file");
            }
            System.out.println("There were " + count + " pairs in: " + fileName);
            br.close();
        } // end if
        else System.out.println("No file name provided . . . aborting");
    } // end main
} // end class

