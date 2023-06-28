package java_a_beginners_guide.chapter_five;

public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        //Using String to control switch statement.
        switch(command) {
            case "connect" :
                System.out.println("Connecting...");
                break;
            case "disconnect":
                System.out.println("Disconnecting...");
                break;
            case "cancel":
                System.out.println("Cancelling...");
                break;
            default : System.out.println("Command error...");
        }
    }
}
