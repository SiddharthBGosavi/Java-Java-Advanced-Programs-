import javax.swing.*;

public class CheckBoxExample
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("CheckBox Example");

        JCheckBox c1 = new JCheckBox("C++");
        JCheckBox c2 = new JCheckBox("Java", true); // Java selected by default

        c1.setBounds(100, 80, 100, 30);
        c2.setBounds(100, 110, 100, 30);

        f.add(c1);
        f.add(c2);

        f.setSize(300, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
