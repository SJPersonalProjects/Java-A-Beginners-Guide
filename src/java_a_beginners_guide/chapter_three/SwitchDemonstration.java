package java_a_beginners_guide.chapter_three;

public class SwitchDemonstration {
    public static void main(String[] args) {

        //Loops through all the case constants of switch statement to execute as require.
        for(int a = 0; a < 10; a++) {
            switch(a) {
                case 0 :
                    System.out.println("a is zero");
                    break;
                case 1 :
                    System.out.println("a is one");
                    break;
                case 2 :
                    System.out.println("a is two");
                    break;
                case 3 :
                    System.out.println("a is three");
                    break;
                case 4 :
                    System.out.println("a is four");
                    break;
                default :
                    System.out.println("a is five or more");
            }
        }
    }
}
