package java_a_beginners_guide.chapter_four;

public class Help {

    public void showMenu() {
        System.out.println("Help on:");
        System.out.println("\t1. if\n\t2. switch\n\t3. for\n\t4. while\n\t5. do-while\n\t6. break\n\t7. continue\n");
        System.out.print("Choose one of above (press q to quit) : ");
    }

    public boolean isValid(char character) {
        if((character < '1' || character > '7') && character != 'q') return false;

        return true;
    }

    public void helpOn(char choice) {
        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) {\n\t//coding statements...\n} else {\n\t//coding statements...\n}");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {\n\tcase constant:\n\t\t//coding statements...\n\tbreak;");
                System.out.println("\tcase constant:\n\t\t//coding statements...\n\t\tbreak;\n\t//...\n}");
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
            case '6':
                System.out.println("The break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
            default: System.out.println("\nSorry, no selection found.");
        }
        System.out.println(); //Statement for a gap of line.
    }
}
