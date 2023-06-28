package java_a_beginners_guide.chapter_two;

public class DynamicInitialization {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //Dynamically initialize volume.
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}
