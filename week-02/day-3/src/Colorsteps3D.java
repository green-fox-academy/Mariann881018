import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Colorsteps3D {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

    int x = 20;
    int y = 20;
    int size = 20;
    graphics.setColor(new Color (212,69,69));

    for (int i = 0; i < 10; i++){
      graphics.fill3DRect(x, y, size, size,true);
      x += size;
      y += size;
      size += 10;
    }

    int q = 300;
    int w = 20;
    int sizeT = 20;
    graphics.setColor(new Color (212,69,69));

    for (int i = 0; i < 10; i++){
      graphics.fill3DRect(q, w, sizeT, sizeT,true);
      q -= sizeT;
      w += sizeT;
      sizeT += 10;

    }


  }
// RGB colors: https://www.rapidtables.com/web/color/RGB_Color.html

// starting points, size: 20, size has to be increased, --> starting points with the same
// size legyen 20,30,40,50...
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
