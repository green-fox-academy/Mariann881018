import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {
    // draw four different size and color rectangles.
    // avoid code duplication.

    int x = 20;
    int y = 20;
    int width = 20;
    int height = 30;

    for (int i = 0; i < 4; i++) {
      Color myNewColor = new Color((50 * i), (50 * i), (50 * i));
      graphics.setColor(myNewColor);
      graphics.fillRect(x, y, width, height);
      x += 50;
      y += 50;
      width += 10;
      height += 10;


    }
  }

/*
     create new color:
      Color myColor = new Color((25), (10), (5)); ---> RGB
      graphics.setColor(myColor);

 */


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    public static void main (String[]args){
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