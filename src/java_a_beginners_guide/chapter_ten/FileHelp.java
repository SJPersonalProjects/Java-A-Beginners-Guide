package java_a_beginners_guide.chapter_ten;

/**
 * Demonstrate the file-based help system.
 */
public class FileHelp {
    public static void main(String[] args) {
        //Help class object.
        Help helpFile = new Help("C:/Users/hp/IdeaProjects/Java Programming Projects/src/java_beginners_guide/chapter_ten/helpfile.txt");

        String topic;

        System.out.println("Try the help system. " +
                "Enter 'stop' to end.");

        do{
            topic = helpFile.getSelection();
            if(!helpFile.helpOn(topic)) System.out.println("Topic not found.\n");
        }while(topic.compareTo("stop") == 0);
    }
}
