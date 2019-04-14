import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    graphics.setColor(Color.black);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    int size = 2;
    int dens = 2000;

    for (int i = 0; i < dens; i++) {
      Color myNewColor = new Color(((int)(Math.random()*255)),((int)(Math.random()*255)),((int)(Math.random()*255)));
      graphics.setColor(myNewColor);
      graphics.fillRect((int)(Math.random()*(WIDTH-size)), (int)(Math.random()*(HEIGHT-size)),size,size);
    }
  }

  // Don't touch the code below
  static int WIDTH = 1600;
  static int HEIGHT = 900;
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