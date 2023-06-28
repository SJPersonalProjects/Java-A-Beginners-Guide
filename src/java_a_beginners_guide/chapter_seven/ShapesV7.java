package java_a_beginners_guide.chapter_seven;

public class ShapesV7 {
    public static void main(String[] args) {
        TriangleV7 triangle1 =
                new TriangleV7(8.0, 12.0, "Outlined");

        //Making a copy of triangle 1.
        TriangleV7 triangle2 =
                new TriangleV7(triangle1);

        //Displaying triangle 1 info as console output.
        System.out.println("Info for triangle1 object:");
        triangle1.showStyle();
        triangle1.showDimensions();
        System.out.println("Area is : " + triangle1.area());

        System.out.println(); //For a gap of line.

        //Displaying triangle 2 info as console output.
        System.out.println("Info for triangle2 object:");
        triangle2.showStyle();
        triangle2.showDimensions();
        System.out.println("Area is : " + triangle2.area());

    }
}
