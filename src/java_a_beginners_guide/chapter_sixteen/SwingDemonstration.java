package java_a_beginners_guide.chapter_sixteen;

import javax.swing.*;
import java.awt.*;

public class SwingDemonstration {

    public SwingDemonstration() {
        //Create a JFrame container.
        JFrame jFrame = new JFrame("A Simple Swing Application");

        //Give the frame an initial size.
        jFrame.setSize(450, 700);

        //Terminate the program when the user closes the application.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a text-based label.
        JLabel jLabel = new JLabel("GUI Programming with Swing");

        //Add the label to the content pane.
        jFrame.add(jLabel, BorderLayout.CENTER);

        //Display the frame.
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemonstration();
                System.out.println("Thread name: " + Thread.currentThread().getName());
            }
        });
    }
}
