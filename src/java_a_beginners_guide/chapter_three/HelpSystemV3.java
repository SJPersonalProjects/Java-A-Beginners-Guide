package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class HelpSystemV3 {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        char character;

        //This loop keeps iterating until the user presses letter 'q' followed by enter.
        for(;;) {
            do {
                //Menu of the program.
                System.out.println("Help on:");
                System.out.println("\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n\t6. break\n\t7. continue\n");
                System.out.print("Choose one (q to quit): ");
                character = scanner.next().charAt(0);

                switch(character) {
                    case '1':
                        System.out.println("The if:\n");
                        System.out.println("if(condition) {\n\t//coding statements...\n}");
                        break;
                    case '2':
                        System.out.println("The switch:\n");
                        System.out.println("switch(expression) {\n\tcase constant:\n\t\t//coding statements...\n\t\tbreak;");
                        System.out.println("\tcase constant:\n\t\t//coding statements...\n\t\tbreak;");
                        System.out.println("\t//...\n}");
                        break;
                    case '3':
                        System.out.println("The for:\n");
                        System.out.println("for(initialization; condition; iteration) {\n\t//coding statements...\n}");
                        break;
                    case '4':
                        System.out.println("The while:\n");
                        System.out.println("while(expression) {\n\t//coding statements...\n}");
                        break;
                    case '5':
                        System.out.println("The do-while:\n");
                        System.out.println("do {\n\t//coding statements...\n}while(condition);");
                        break;
                    case '6':
                        System.out.println("The break:\n");
                        System.out.println("break; or break label;");
                        break;
                    case '7':
                        System.out.println("The continue:\n");
                        System.out.println("continue; or continue label;");
                        break;
                    case 'q':
                        System.out.println("Program has been exited...");
                        break;
                    default : System.out.println("Sorry, no selection found.");

                }

            } while (character < 1 || character > 7 && character != 'q');

            //If the user presses letter 'q' then break the main infinite loop.
            //which eventually terminates the whole program.
            if(character == 'q') break;
        }
    }
}
