package java_a_beginners_guide.chapter_sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemonstration implements ActionListener {
    //Instance fields.
    JTextField mJTextField;
    JButton mJButton;
    JLabel mJLabelPrompt, mJLabelContents;

    //A parameter-less constructor to demonstrate the whole program.
    public TextFieldDemonstration() {
        //New JFrame container.
        JFrame jFrame = new JFrame("TextField Example");

        //Specifiying FlowLayout for the layout manager.
        jFrame.setLayout(new FlowLayout());

        //Initial size of the frame.
        jFrame.setSize(240, 120);

        //When the user closes the application terminate the program.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //A text field that is 10 columns wide.
        mJTextField = new JTextField(10);

        //Setting the action commands for the text field.
        mJTextField.setActionCommand("myTextField");

        //Creating the reverse button.
        mJButton = new JButton("Reverse");

        //Add the action listeners.
        mJTextField.addActionListener(this);
        mJButton.addActionListener(this);

        mJLabelPrompt = new JLabel("Enter Text: ");
        mJLabelContents = new JLabel("");

        //Add all the componenets to the content pane.
        jFrame.add(mJLabelPrompt);
        jFrame.add(mJLabelContents);
        jFrame.add(mJTextField);
        jFrame.add(mJButton);

        //Display the frame.
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Reverse")) {
            //The reverse button was pressed.
            String originalString = mJTextField.getText();
            String reversedString = "";

            //Reverse the string in the text field.
            for(int i = originalString.length() - 1; i >= 0; i--) {
                reversedString += originalString.charAt(i);
            }

            //Store the reversed String in the text field.
            mJTextField.setText(reversedString);
        }else {
            //Enter was pressed while focus was in the text field.
            mJLabelContents.setText("You pressed ENTER. Text is: " + mJTextField.getText());
        }
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldDemonstration();
            }
        });
    }
}
