import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a 50 long horizontal line from that point.
    // Draw 3 lines with that function. Use loop for that.


    int x = 25;
    int y = 25;

    //horizontalLines(30,100,graphics);

    for (int i = 1; i <= 4; i++){
      horizontalLines(x , y, graphics);
      x *= 3;
      y *=3;
    }

  }
    public static void horizontalLines (int x, int y, Graphics graphics){
      graphics.drawLine(x, y, x+50,y);
    }


/*
  public static void drawLineToCenter(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, WIDTH /2 , HEIGHT/2);
  }
    int x = 25;
    int y = 25;
    int a = 3;
    for (int i = 1; i<= a; i++){
      drawLineToCenter(x,y,graphics);
      x *=10;
      y *=3;
    }
 */


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