import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {
  MyFrame () {
    this.setTitle("JFrame title goes here");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(420, 420);
    this.setVisible(true);

    ImageIcon image = new ImageIcon("logo.png");
    this.setIconImage(image.getImage()); // change icon of frame
    this.getContentPane().setBackground(new Color(80, 80, 80));
  }
}