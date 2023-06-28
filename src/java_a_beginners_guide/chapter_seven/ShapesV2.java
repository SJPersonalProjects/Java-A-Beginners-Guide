package java_a_beginners_guide.chapter_seven;

public class ShapesV2 {
    public static void main(String[] args) {
        //Triangle objects.
        TriangleV2 triangle1 = new TriangleV2();
        TriangleV2 triangle2 = new TriangleV2();

        //Assigning values to triangle 1.
        triangle1.setWidth(4.0);
        triangle1.setHeight(4.0);
        triangle1.setStyle("Filled");

        //Assigning values to triangle 2.
        triangle2.setWidth(8.0);
        triangle2.setHeight(8.0);
        triangle2.setStyle("Outlined");

        //Displaying data of triangle 1 as console output.
        System.out.println("Info for triangle 1: ");
        triangle1.showDimensions();
        triangle1.showStyle();
        System.out.println("Area is : " + triangle1.area());

        System.out.println(); //for a gap of line.

        //Displaying data of triangle 2 as console output.
        System.out.println("Info for triangle 2: ");
        triangle2.showDimensions();
        triangle2.showStyle();
        System.out.println("Area is : " + triangle2.area());
    }
}
