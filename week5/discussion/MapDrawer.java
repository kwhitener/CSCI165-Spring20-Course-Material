import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.EventQueue;

class MapDrawer extends JPanel {

    private static final long serialVersionUID = 1L;
    private JFrame window = new JFrame();

    // constructor
    public MapDrawer() {
        window.add(this);
        window.setTitle("2D Drawing");
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    // this paintComponent method gets called automatically by the JRE
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMap(g);
    }
  
    public static void main(String[] args) {
        // don't worry about this code, unless you want to research
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() { 
                MapDrawer ex = new MapDrawer(); // create an instance of "this" class, calling constructor
                ex.setVisible(true);            // make the frame visible
                ex.readMatrix("");// call the readMatrix method. Use the instance, because method is not static
            }
        });
    } // end main

    // TO DO: Implement the following methods
    // You decide how to handle the matrix
    private void readMatrix(String fileName){}
    // find grey scale minimum
    private int findMinimum(){
        int min = 0;
        // write the logic yourself. No shortcuts. No API calls
        return min;
    }
    // find grey scale maximum
    private int findMaximum(){
        int max = 0;
        // write the logic yourself. No shortcuts. No API calls
        return max;
    }

    private void drawMap(Graphics graphics){
        Graphics2D g2d = (Graphics2D) graphics;
        /*
            RGB Colors:
            ================================================
            Black       => (0, 0, 0)        => low elevation
            Mid Grey    => (128, 128, 128)  => mid elevation
            White       => (255, 255, 255)  => high elevation

            Grey Scale colors are scaled in matching set of 3 numeric values
        */
    }
} // end class