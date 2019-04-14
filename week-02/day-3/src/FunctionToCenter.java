import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class FunctionToCenter {

  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    lineToCenter(0,0,graphics);

  }

  public static void lineToCenter (int a, int b, Graphics graphics) {
    graphics.drawLine(a, b, WIDTH/2, HEIGHT/2);

    for (int i = 1; i < 17; i++) {
      Color myNewColor = new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
      graphics.setColor(myNewColor);
      graphics.drawLine(a,b,WIDTH/2, HEIGHT/2);
      a += 20;
    }
    for (int i = 1; i < 18; i++) {
      Color myNewColor = new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
      graphics.setColor(myNewColor);
      graphics.drawLine(a,b,WIDTH/2, HEIGHT/2);
      b += 20;
    }
    for (int i = 1; i < 20; i++) {
      Color myNewColor = new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
      graphics.setColor(myNewColor);
      graphics.drawLine(a,b,WIDTH/2, HEIGHT/2);
      a -= 20;
    }
    for (int i = 1; i < 20; i++) {
      Color myNewColor = new Color(((int) (Math.random() * 255)), ((int) (Math.random() * 255)), ((int) (Math.random() * 255)));
      graphics.setColor(myNewColor);
      graphics.drawLine(a, b, WIDTH / 2, HEIGHT / 2);
      b -= 20;
    }
  }



  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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