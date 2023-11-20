import javax.swing.*;
import java.awt.*;

public class shapeDisplayFrame extends JFrame
{
    private JLabel imageLabel;
    
    public shapeDisplayFrame()
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
        ImageIcon icon = new ImageIcon("ISEimages/" + shapeName.toLowerCase() + ".png");
        imageLabel.setIcon(icon);
        // Resize frame to fit image.
        pack();
        setVisible(true);
    }
}
