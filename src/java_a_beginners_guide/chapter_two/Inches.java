package java_a_beginners_guide.chapter_two;

public class Inches {
    public static void main(String[] args) {
        long ci, im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}
