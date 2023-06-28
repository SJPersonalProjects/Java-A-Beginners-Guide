package java_a_beginners_guide.chapter_seven;

public class ShapesV6 {
    public static void main(String[] args) {
        //ColorTriangle class objects.
        ColorTriangle object1 =
                new ColorTriangle(8.0, 12.0, "Outlined", "Blue");
        ColorTriangle object2 =
                new ColorTriangle(2.0, 2.0, "Filled", "Red");

        //Displaying information for object 1 as console output.
        System.out.println("Info for object1: ");
        object1.showStyle();
        object1.showDimensions();
        object1.showColor();
        System.out.println("Area is : " + object1.area());

        System.out.println(); //For a gap of line.

        //Displaying information for object 2 as console output.
        System.out.println("Info for object2: ");
        object2.showStyle();
        object2.showDimensions();
        object2.showColor();
        System.out.println("Area is : " + object2.area());
    }
}
