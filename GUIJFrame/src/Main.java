import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // JFrame = a GUI window to add component to

       /* JFrame frame = new JFrame(); //create a frame
        frame.setVisible(true); //make frame visible
        frame.setSize(500,500); //increase size horizontally and vertically
        frame.setTitle("GUI JFrame");  //title name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out off application
        frame.setResizable(false); //prevent frame being from resized

        ImageIcon image = new ImageIcon("java-console.webp"); //create icon of the image
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(144,128,215)); //change color of background */

        new MyFrame();
    }
}