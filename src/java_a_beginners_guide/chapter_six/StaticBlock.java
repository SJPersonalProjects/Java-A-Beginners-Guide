package java_a_beginners_guide.chapter_six;

public class StaticBlock {
    //Static fields.
    public static double rootOf2;
    public static double rootOf3;

    //Static block to execute before anything else.
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    /**
     * Parameterized constructor with a message to see
     * if it executes right after the static block.
     * @param message: to see if it displays the message
     *               after static block's execution.
     */
    public StaticBlock(String message) {
        System.out.println(message);
    }
}
