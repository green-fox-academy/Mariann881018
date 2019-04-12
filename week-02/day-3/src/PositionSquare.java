import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 3 parameters:
    // the x and y coordinates of the square's top left corner and the graphics
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    int x = 20;
    int y = 20;


    for (int i = 1; i <= 3; i++){
      graphics.setColor(Color.cyan);
      mydrawSquare(x, y,graphics);
      x += 50;
      y += 50;
    }

  }
  public static void mydrawSquare (int x, int y, Graphics graphics){
    graphics.fillRect(x, y, 50,50);

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
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}