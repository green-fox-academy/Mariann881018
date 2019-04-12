import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    int sX = 50;
    int sY = 10;  //- starting point x,y
    int eX = WIDTH-sY;
    int eY = 20;  //- ending point x,y

    graphics.setColor(new Color(166, 18,152));
    for (int i = 0; i < (eY*13); i+=20) {
      graphics.drawLine(sX+i, sY, eX, eY+i++);
    }

    int rX = 10;
    int rY = 50;
    int tX = 20;
    int ty = HEIGHT-rX;

    graphics.setColor(new Color(100,200,100));
    for (int i = 0; i < (tX*13); i+=20) {
      graphics.drawLine(rX, rY+i, tX+i++, ty);
    }

  }

// RGB colors: https://www.rapidtables.com/web/color/RGB_Color.html

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