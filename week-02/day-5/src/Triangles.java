import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int x = WIDTH / 2;
    int y = HEIGHT / 10;


      for (int e = 0; e < 10; e++){
        drawTriangle(x, y, graphics);
        x += 10;
        y += 15;
      }


    drawTriangle(x, y, graphics);
    y+=15;

    int r = WIDTH / 2;
    int t = HEIGHT / 10;

      for (int z = 0; z < 5; z++) {
        drawTriangle(r, t, graphics);
        r -= 10;
        t += 15;
      }
    }


  public static void drawTriangle(int x, int y, Graphics graphics) {
    graphics.drawLine(x,y,x-10, y+15);
    graphics.drawLine(x-10,y+15,x+10,y+15);
    graphics.drawLine(x+10, y+15,x,y);
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