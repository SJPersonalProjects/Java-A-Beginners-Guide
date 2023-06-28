package java_a_beginners_guide.chapter_three;

import java.util.Scanner;

/**
 * The main reason to build this program is to memorize the syntax of the following main things in the menu.
 * As a beginner we need to re-create the main looping statements or selection statements or jump statements
 * just to memorize their purpose which makes it easier to get used to their usage.
 */
public class HelpSystemV2 {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        char characterChoose;

        do{
            System.out.println("Help on:");
            System.out.println("\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n");
            System.out.print("Choose one: ");
            characterChoose = scanner.next().charAt(0);

            //Switch statement to select from the menu.
            switch (characterChoose) {
                case '1':
                    System.out.println("\nThe if:\n");
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
                    System.out.println("while(condition) {\n\t//coding statements...\n}");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {\n\t//coding statements...\n} while(condition);");
                    break;
                default : System.out.println("Sorry, selection not found.");
            }

        }while(characterChoose < '1' || characterChoose > '5');
    }
}
