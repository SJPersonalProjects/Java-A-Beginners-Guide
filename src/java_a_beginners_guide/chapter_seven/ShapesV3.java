package java_a_beginners_guide.chapter_seven;

public class ShapesV3 {
    public static void main(String[] args) {
        //Triangle class objects.
        TriangleV3 triangle1 = new TriangleV3(4.0, 4.0, "Filled");
        TriangleV3 triangle2 = new TriangleV3(8.0, 8.0, "Outlined");

        //Displaying data of triangle 1 as console output.
        System.out.println("Info for triangle 1: ");
        triangle1.showDimension();
        triangle1.showStyle();
        System.out.println("Area is : " + triangle1.area());

        System.out.println(); //For a gap of line.

        //Displaying data of triangle 2 as console output.
        System.out.println("Info for triangle 2: ");
        triangle2.showDimension();
        triangle2.showStyle();
        System.out.println("Area is : " + triangle2.area());
    }
}
