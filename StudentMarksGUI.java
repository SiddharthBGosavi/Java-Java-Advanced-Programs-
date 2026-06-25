import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentMarksGUI {
    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Student Marks");
        frame.setSize(350, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels and TextFields for subjects
        JLabel l1 = new JLabel("Maths:");
        JTextField t1 = new JTextField(10);

        JLabel l2 = new JLabel("Science:");
        JTextField t2 = new JTextField(10);

        JLabel l3 = new JLabel("English:");
        JTextField t3 = new JTextField(10);

        JLabel l4 = new JLabel("Computer:");
        JTextField t4 = new JTextField(10);

        JLabel l5 = new JLabel("Total:");
        JLabel totalLabel = new JLabel(" ");

        JLabel l6 = new JLabel("Percentage:");
        JLabel perLabel = new JLabel(" ");

        JButton btn = new JButton("Calculate");

        // Button Action
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int m1 = Integer.parseInt(t1.getText());
                int m2 = Integer.parseInt(t2.getText());
                int m3 = Integer.parseInt(t3.getText());
                int m4 = Integer.parseInt(t4.getText());

                int total = m1 + m2 + m3 + m4;
                double percentage = total / 4.0;

                totalLabel.setText(String.valueOf(total));
                perLabel.setText(String.valueOf(percentage) + "%");
            }
        });

        // Add components to frame
        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(l3); frame.add(t3);
        frame.add(l4); frame.add(t4);
        frame.add(btn);
        frame.add(l5); frame.add(totalLabel);
        frame.add(l6); frame.add(perLabel);

        // Display frame
        frame.setVisible(true);
    }
}