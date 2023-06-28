package java_a_beginners_guide.chapter_three;

import java.util.Scanner;
public class HelpSystem {
    public static void main(String[] args) {
        //Scanner class object.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Help on:\n\t1. if\n\t2. switch");
        System.out.print("Choose one: ");
        char character = scanner.next().charAt(0); //takes the character as input.

        switch(character) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("\tcase constant:");
                System.out.println("\t\tstatement sequence;");
                System.out.println("\t\tbreak;");
                System.out.println("\t//...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
}
