package java_a_beginners_guide.chapter_ten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    //Instance fields.
    private String helpFile;

    /**
     * Parameterized constructor to get the file object.
     * @param helpFile: name of the help file.
     */
    public Help(String helpFile) {
        this.helpFile = helpFile;
    }

    /**
     * Method to get the name of the file.
     * @return helpFile: name of the file.
     */
    public String getHelpFile() {
        return helpFile;
    }

    /**
     * Method to set the name of the file.
     * @param helpFile: name of the file.
     */
    public void setHelpFile(String helpFile) {
        this.helpFile = helpFile;
    }

    public boolean helpOn(String what) {
        int character;
        String topic, info;

        //Open the file.
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(helpFile))) {
            do{
                //Read characters until # is found.
                character = bufferedReader.read();

                //Now, see if topics match.
                if(character == '#') {
                    topic = bufferedReader.readLine();
                    if(what.compareTo(topic) == 0) { //Found topic.
                        do{
                            info = bufferedReader.readLine();
                            if(info != null) System.out.println(info);
                        }while((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            }while(character != -1);
        }catch(IOException ioException) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false;
    }

    /**
     * Get a help topic.
     * @return topic: return a selected topic.
     */
    public String getSelection() {
        String topic = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try{
            topic = bufferedReader.readLine();
        }catch(IOException ioException) {
            System.out.println("Error reading console");
        }

        return topic;
    }


}
