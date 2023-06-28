package java_a_beginners_guide.chapter_four;

import java.util.Scanner;
public class HelpDemonstration {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);
        //Help class object.
        Help helpSystem = new Help();

        char characterChoose;

        for(;;) {
            //Until the user don't press the right key it keeps iterating.
            do {
                //Shows menu from the help class.
                helpSystem.showMenu();
                characterChoose = scanner.next().charAt(0);

            }while(!helpSystem.isValid(characterChoose));

            //If the user presses 'q' letter followed by enter the program terminates.
            if(characterChoose == 'q') break;

            //Brings 2 lines of gap between statements.
            System.out.println("\n");

            //Gets the selected data...
            helpSystem.helpOn(characterChoose);
        }
    }
}
