package java_a_beginners_guide.chapter_sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemonstration implements ActionListener {

    //Instance field.
    JLabel mJLabel;

    //A constructor.
    public ButtonDemonstration() {
        //Create a new JFrame container.
        JFrame jFrame = new JFrame("A Button Example");

        //Specify FlowLayout for the layout manager.
        jFrame.setLayout(new FlowLayout());

        //Give the frame an initial size.
        jFrame.setSize(475, 300);

        //Terminate the program when the user closes the application.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make two buttons.
        JButton buttonOne = new JButton("Up");
        JButton buttonTwo = new JButton("Down");

        //Add action listeners.
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);

        //Add the buttons to the content pane.
        jFrame.add(buttonOne);
        jFrame.add(buttonTwo);

        //Create a label.
        mJLabel = new JLabel("Press a button");

        //Add the label to the frame.
        jFrame.add(mJLabel);

        //Display the frame.
        jFrame.setVisible(true);
    }

    //Handle button events.
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Up")) {
            mJLabel.setText("You pressed Up");
        }else {
            mJLabel.setText("You pressed Down");
        }
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemonstration();
            }
        });
    }
}
