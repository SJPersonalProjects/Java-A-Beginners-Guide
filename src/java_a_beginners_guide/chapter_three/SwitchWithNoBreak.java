package java_a_beginners_guide.chapter_three;

public class SwitchWithNoBreak {
    public static void main(String[] args) {

        //Loops through the sequence of cases that are without break statements
        //This strange is followed due to the break statement that is absent in this case.
        for(int i = 0; i < 5; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
            }
            System.out.println();
        }
    }
}
