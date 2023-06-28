package java_a_beginners_guide.chapter_one;

/**
 * This program introduces to a java's new feature called for loop.
 * Use for loop to iterate over a single statement.
 */
public class ForDemonstration {
    public static void main(String[] args) {
        int count;
        
        //for statement that iterates 5 times over the statement.
        for(count = 0; count < 5; count = count + 1)
            System.out.println("This is count : " + count);

        System.out.println("Done!");
    }
}
