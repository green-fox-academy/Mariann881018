import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics line) {
    // Draw a box that has different colored lines on each edge.

    line.setColor(Color.GREEN);
    line.drawLine(25, 25, 125 , 25);
    line.setColor(Color.red);
    line.drawLine(125,25,125,125);
    line.setColor(Color.blue);
    line.drawLine(125,125,25,125);
    line.setColor(Color.pink);
    line.drawLine(125,125,25,25);


  }



  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;
  public static void main(String[] args) {

    JFrame jFrame = new JFrame("Drawing");

    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    ImagePanel panel = new ImagePanel();

    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));

    jFrame.add(panel);

    jFrame.setLocationRelativeTo(null);

    jFrame.setVisible(true);

    jFrame.pack();

  }



  static class ImagePanel extends JPanel {

    @Override

    protected void paintComponent(Graphics line) {

      super.paintComponent(line);

      mainDraw(line);

    }

  }

}