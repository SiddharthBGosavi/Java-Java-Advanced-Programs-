import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    public void init() {
        // Called once — initialize resources
        System.out.println("Applet Initialized");
    }

    public void start() {
        // Called on load and every revisit
        System.out.println("Applet Started");
    }

    public void paint(Graphics g) {
        // Called to render content
        g.drawString("Hello, Applet World!", 50, 50);
    }

    public void stop() {
        // Called when page is left
        System.out.println("Applet Stopped");
    }

    public void destroy() {
        // Called once on browser close
        System.out.println("Applet Destroyed");
    }
}
