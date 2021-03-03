// Graphics objects
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
// File handling objects
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
// GUI objects to create the window
import javax.swing.JFrame;
import javax.swing.JPanel;
// GUI apps should be added to the JRE event queue
import java.awt.EventQueue;

/*
    Ths program will read a matrix of RGB values from a file and render the "image" to a JPanel using Java2D Graphics
    The "pixels" will be drawn with filled rectangles. Each RGB value represents the color of a single rectangle
    The JPanel will be contained in a JFrame window.

    There will be code in here that you can ignore for now, unless yo uhave the time and inclination to research.
*/

// class BitMapper "is a" JPanel
class BitMapper extends JPanel {

    private static final long serialVersionUID = 1L;    // recommended by compiler
    private JFrame window = new JFrame();               // create a JFrame instance to contain the JPanel

    private int[][] rgbMatrix = new int[23][39*3];      // the matrix to store the RGB values

    // constructor to build our window and place the JPanel
    public BitMapper() {
        window.add(this);                               // add "this" JPanel to the JFrame
        window.setTitle("2D Drawing");                  // give it a title bar
        window.setSize(405, 270);                       // how big is the window?
        window.setLocationRelativeTo(null);             // place window in the middle of the screen, not relative to any other GUI object
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // What happens when you close the window?
        window.setVisible(true);                        // make it visible
    }

    // this paintComponent method gets called automatically by the JRE
    // place drawing code here, or delegate to another method (better)
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);   // call our doDrawing method, passing the Graphics object
    }
    
    public static void main(String[] args) {
        // don't worry about this code, unless you want to research
        // create a Runnable thread on the JRE EventQueue
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                BitMapper ex = new BitMapper();  // create an instance of "this" class by calling the constructor
                ex.readMatrix("pixel_data.txt"); // call the readMatrix method. Use the instance, because it's not static
            }
        });
    } // end main

    // DEFINE YOUR METHODS HERE.

    void readMatrix(String fileName){
        try{
            File file = new File(fileName);         // build the File object
            Scanner scanner = new Scanner(file);    // have the scanner attach to the file
            // nested for loops based on matric dimensions
            for(int i = 0; i < rgbMatrix.length; i++){ 
                // variables to store the index positions of each red, green and blue
                int r = 0, g = 1, b = 2;
                // inner loop processes the number of "columns"
                // length is divided by 3 due to there being 3 values for each RGB entry {rrr-ggg-bbb}
                for(int j = 0; j < rgbMatrix[i].length/3; ++j){
                    String RGB = scanner.next();                    // scan a single token
                    String[] rgbArray = RGB.split("-");             // split at the dash
                    rgbMatrix[i][r] = Integer.valueOf(rgbArray[0]); // index 0 is "red"
                    rgbMatrix[i][g] = Integer.valueOf(rgbArray[1]); // index 1 is "green"
                    rgbMatrix[i][b] = Integer.valueOf(rgbArray[2]); // index 2 is "blue"

                    r += 3; // increase "red" index by 3
                    g += 3; // increase "green" index by 3
                    b += 3; // increase "blue" index by 3
                } // end inner loop
            } // end outer loop
            scanner.close(); // NO LEAKS!
        }catch(FileNotFoundException fnfe){
            System.out.println("WHERE'S THE FILE??!!");
        } // end catch
    } // end method

    // add your own drawing intructions in this method
    // a call to doDrawing has been included in "paintComponent"
    private void doDrawing(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics; // cast graphics instance to a 2D instance

        // cartesian points, to control where rectangles are drawn
        int x = 1, y = 1;
        final int RECT_HEIGHT   = 10; // heght of the rectangle to be drawn
        final int RECT_WIDTH    = 10; // width of the rectangle to be drawn 
       
        // nested for loops to iterate through matrix
        // outer loop processes the number of "rows"
        for(int i = 0; i < rgbMatrix.length; ++i){
            // variables to store the index positions of each red, green and blue
            int r = 0, g = 1, b = 2;
            // inner loop processes the number of "columns"
            // length is divided by 3 due to there being 3 values for each rectangle {RGB}
            for(int j = 0; j < rgbMatrix[i].length/3; ++j){
                int red     = rgbMatrix[i][r];  // get current RED value from the matrix
                int green   = rgbMatrix[i][g];  // get current GREEN value from the matrix
                int blue    = rgbMatrix[i][b];  // get current BLUE value from the matrix
                
                g2d.setColor(new Color(red, green, blue));  // using RGB values from above, set the COLOR for this draw
                g2d.fillRect(x, y, RECT_HEIGHT, RECT_WIDTH);// Draw a filled rectangle at x, y of size defined by constants
                x += RECT_WIDTH;    // move x position to the right by "rectangle width"
                r += 3;             // increase "red" index by 3
                g += 3;             // increase "green" index by 3
                b += 3;             // increase "blue" index by 3
            } // end inner loop
            y += RECT_HEIGHT;       // move y position down by "rectangle height"
            x = 1;                  // reset x to left axis
        } // end outer loop
    } // end doDrawing
} // end class
