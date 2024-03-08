import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args){

    // JFrame = a GUI window to add components to

    JFrame frame = new JFrame();
    frame.setTitle("JFrame title goes here");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setSize(420, 420);
    frame.setVisible(true);

    ImageIcon image = new ImageIcon("logo.png");
    frame.setIconImage(image.getImage()); // change icon of frame

    // frame.getContentPane().setBackground(Color.green);
    frame.getContentPane().setBackground(new Color(80, 80, 80));

  }
}