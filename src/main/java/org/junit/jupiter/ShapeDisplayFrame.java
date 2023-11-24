package org.junit.jupiter;

import javax.swing.*;
import java.awt.*;

public class ShapeDisplayFrame extends JFrame
{
    private JLabel imageLabel;
    
    public ShapeDisplayFrame()
    {
        setTitle("Shape Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        imageLabel = new JLabel("", SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);
        setSize(300, 300); // Set Initial size of the Frame.
        setLocationRelativeTo(null); // Center the frame.
    }

    public void displayShapeImage(String shapeName)
    {
      String imagePath = "ISEimages/" + shapeName.toLowerCase() + ".png";
      ImageIcon icon = new ImageIcon(imagePath);

      Image image = icon.getImage();
      Image resizedImage = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
      icon = new ImageIcon(resizedImage);

      if (icon.getImageLoadStatus() != MediaTracker.COMPLETE)
      {
        System.out.println("Error loading image: " + icon);
        return;
      }

        imageLabel.setIcon(icon);
        // Resize frame to fit image.
        pack();
        setVisible(true);
    }
}
