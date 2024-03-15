import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    
    MyFrame(){
        this.setVisible(true); //make this visible
        this.setSize(500,500); //increase size horizontally and vertically
        this.setTitle("GUI Frame");  //title name
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out off application
        this.setResizable(false); //prevent frame being from resized

        ImageIcon image = new ImageIcon("java-console.webp"); //create icon of the image
        this.setIconImage(image.getImage()); //change icon of this
        this.getContentPane().setBackground(new Color(144,128,215)); //change color of background
    }
}
