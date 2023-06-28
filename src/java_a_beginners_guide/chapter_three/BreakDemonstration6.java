package java_a_beginners_guide.chapter_three;

public class BreakDemonstration6 {
    public static void main(String[] args) {
        int x = 0, y = 0;

  stop1:for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y : " + x + " " + y);
            }
        }

        System.out.println(); //statement for a single line gap.

        for(x = 0; x < 5; x++)
  stop2:{
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop2;
                System.out.println("x and y : " + x + " " + y);
            }
        }

    }
}
