package java_a_beginners_guide.chapter_seven;

public class ShapesV5 {
    public static void main(String[] args) {
        //TriangleV5 class objects.
        TriangleV5 triangle1;
        TriangleV5 triangle2 = new TriangleV5(8.0, 12.0, "Outlined");
        TriangleV5 triangle3 = new TriangleV5(4.0);

        //Assigning values from triangle2 to triangle1.
        triangle1 = triangle2;

        //Displaying data from triangle 1 as console output.
        System.out.println("Info for triangle 1 : ");
        triangle1.showStyle();
        triangle1.showDimensions();
        System.out.println("Area is : " + triangle1.area());

        System.out.println("\n"); //For a gap of line.

        //Displaying data from triangle 2 as console output.
        System.out.println("Info for triangle 2 : ");
        triangle2.showStyle();
        triangle2.showDimensions();
        System.out.println("Area is : " + triangle2.area());

        System.out.println("\n"); //For a gap of line.

        //Displaying data from triangle 3 as console output.
        System.out.println("Info for triangle 3 : ");
        triangle3.showStyle();
        triangle3.showDimensions();
        System.out.println("Area is : " + triangle3.area());
    }
}
