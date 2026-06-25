import java.awt.*;
import javax.swing.*;

public class AWT extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(90, 90, 100, 60);
        g.drawOval(160, 30, 100, 60);
        g.drawLine(30, 120, 260, 120);
        g.drawString("Graphics Demo", 90, 160);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Graphics Example");
        f.add(new AWT());
        f.setSize(700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

