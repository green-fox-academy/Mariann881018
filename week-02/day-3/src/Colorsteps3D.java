import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Colorsteps3D {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

    int x, y, size;
    x = y = size = 10;


    for (int i = 0; i < 5; i++){
      Color myNewColor = new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
      graphics.setColor(myNewColor);
      drawSteps(x,y,size+=(size/2),graphics);
      x += size;
      y += size;
    }
  }

  public static void drawSteps (int x, int y, int size, Graphics graphics) {
    graphics.fill3DRect(x, y, size, size,true);
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
