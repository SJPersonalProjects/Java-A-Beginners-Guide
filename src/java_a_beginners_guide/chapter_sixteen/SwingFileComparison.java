package java_a_beginners_guide.chapter_sixteen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class SwingFileComparison implements ActionListener {
    //Instance fields.
    JTextField mJTextFieldOne; //Holds the first file name.
    JTextField mJTextFieldTwo; //Holds the second file name.
    JButton mJButtomComparison; //Button for comparison.
    JLabel mJLabelOne, mJLabelTwo; //Displays prompts.
    JLabel mJLabelResult; //Displays result and error messages.

    //A parameterless constructor to complete the task.
    public SwingFileComparison() {
        //Create a new JFrame container.
        JFrame jFrame = new JFrame("Compare File");

        //Specify flow layout for the layout manager.
        jFrame.setLayout(new FlowLayout());

        //Give the frame an initial size.
        jFrame.setSize(200, 190);

        //Terminate the program when the user closes the application.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create the text fields for the file names.
        mJTextFieldOne = new JTextField(14);
        mJTextFieldTwo = new JTextField(14);

        //Set the action commands for the text fields.
        mJTextFieldOne.setActionCommand("FileA");
        mJTextFieldTwo.setActionCommand("FileB");

        mJButtomComparison = new JButton("Compare");
        //Create the compare button.
        mJButtomComparison.addActionListener(this);

        //Create the labels.
        mJLabelOne = new JLabel("First file: ");
        mJLabelTwo = new JLabel("Second file: ");
        mJLabelResult = new JLabel("");

        //Add the components to the content pane.
        jFrame.add(mJLabelOne);
        jFrame.add(mJTextFieldOne);
        jFrame.add(mJLabelTwo);
        jFrame.add(mJTextFieldTwo);
        jFrame.add(mJButtomComparison);
        jFrame.add(mJLabelResult);

        //Display the frame.
        jFrame.setVisible(true);
    }

    //Compare the files when the compare button is clicked.
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int i = 0, j = 0;

        //First, comfirm that both files names have been entered.
        if(mJTextFieldOne.getText().equals("")) {
            mJLabelResult.setText("First file name is missing");
            return;
        }
        if(mJTextFieldTwo.getText().equals("")) {
            mJLabelResult.setText("Second file name is missing");
            return;
        }

        //Compare the files. Use try-with-resource to manage the files.
        try (FileInputStream fileInputStream1 = new FileInputStream(mJTextFieldOne.getText());
                FileInputStream fileInputStream2 = new FileInputStream(mJTextFieldTwo.getText())) {
            do {
                //Checks the contents of each file.
                i = fileInputStream1.read();
                j = fileInputStream2.read();
                if(i != j) break;
            }while(i != -1 && j != -1);

            if(i != j) {
                mJLabelResult.setText("Files aren't the same");
            }else {
                mJLabelResult.setText("File are the same");
            }
        }catch(IOException ioException) {
            mJLabelResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        //Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFileComparison();
            }
        });
    }
}
