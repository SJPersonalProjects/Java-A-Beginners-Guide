package java_a_beginners_guide.chapter_seven;

public class ShapesV4 {
    public static void main(String[] args) {
        //TriangleV4 class objects.
        TriangleV4 triangle1 = new TriangleV4(4.0, 4.0, "Filled");
        TriangleV4 triangle2 = new TriangleV4(8.0, 8.0, "Outlined");

        //Displaying the data of triangle 1 as console output.
        System.out.println("Info for triangle 1: ");
        triangle1.showDimensions();
        triangle1.showStyle();
        System.out.println("Area is : " + triangle1.area());

        System.out.println("\n");//for a gap of line.

        //Displaying the data of triangle 2 as console output.
        System.out.println("Info for triangle 2: ");
        triangle2.showDimensions();
        triangle2.showStyle();
        System.out.println("Area is : " + triangle2.area());
    }
}
