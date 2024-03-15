# JFrame-GUI
GUI JFrame Code
  //create a frame
     JFrame frame = new JFrame();
  //make frame visible
      frame.setVisible(true); 
  //increase size horizontally and vertically
       frame.setSize(500,500); 
  // title name
        frame.setTitle("GUI JFrame");  
  //exit out off application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  //prevent frame being from resized
        frame.setResizable(false); 

  //create icon of the image
        ImageIcon image = new ImageIcon("java-console.webp"); 
  //change icon of frame
        frame.setIconImage(image.getImage());        
  //change color of background
  frame.getContentPane().setBackground(new Color(144,128,215)); 
