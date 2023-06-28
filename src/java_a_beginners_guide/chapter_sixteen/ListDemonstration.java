package java_a_beginners_guide.chapter_sixteen;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemonstration implements ListSelectionListener {
    //Instance fields.
    JList<String> mJList;
    JLabel mJLabel;
    JScrollPane mJScrollPane;

    //Array of names to put in the JList.
    private final String[] arrayOfNames = {"Sherry", "Jon", "Rachel",
                                        "Sasha", "Josselyn", "Randy",
                                        "Tom", "Mary", "Ken",
                                        "Andrew", "Matt", "Todd"};

    //A parameterless constructor to implement the whole coding tasks.
    public ListDemonstration() {
        //Create a new JFrame container.
        JFrame jFrame = new JFrame("JList Example");

        //Specify a flow layout.
        jFrame.setLayout(new FlowLayout());

        //Give the frame an initial size.
        jFrame.setSize(200, 160);

        //Terminate the program when the user closes the application.
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create a JList.
        mJList = new JList<>(arrayOfNames);

        //Set the list selection mod to a single selection.
        mJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Add list to a scroll pane.
        mJScrollPane = new JScrollPane(mJList);

        //Set the preferred size of the scorll pane.
        mJScrollPane.setPreferredSize(new Dimension(120, 90));

        //Make a label that displays the selection.
        mJLabel = new JLabel("Please choose a name");

        //Add list selection handler.
        mJList.addListSelectionListener(this);

        //Add the list and label to the content pane.
        jFrame.add(mJScrollPane);
        jFrame.add(mJLabel);

        //Display the frame.
        jFrame.setVisible(true);
    }

    //Handle list selection events.
    @Override
    public void valueChanged(ListSelectionEvent e) {
        //Get the index of the changed item.
        int index = mJList.getSelectedIndex();

        //Display the selection if the item was selected.
        if(index != -1) {
            mJLabel.setText("Current selection: " + arrayOfNames[index]);
        }else {
            //Otherwise, reprompt.
            mJLabel.setText("Please choose a name");
        }
    }

    public static void main(String[] args) {
        //Create a frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemonstration();
            }
        });
    }
}
