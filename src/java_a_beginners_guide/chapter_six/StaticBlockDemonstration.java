package java_a_beginners_guide.chapter_six;

public class StaticBlockDemonstration {
    public static void main(String[] args) {
        //Static block object.
        StaticBlock staticBlock = new StaticBlock("Now constructor executes...");

        //Displaying square roots of 2 and 3...
        System.out.println("Square root of 2 : " +
                StaticBlock.rootOf2);

        System.out.println("Square root of 3 : " +
                StaticBlock.rootOf3);
    }
}
