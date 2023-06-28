package java_a_beginners_guide.chapter_seven;

public class Shapes {
    public static void main(String[] args) {
        //Triangle class objects.
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Rectangle rectangle = new Rectangle();

        //Assigning values to triangle 1 object.
        triangle1.width = 4.0;
        triangle1.height = 4.0;
        triangle1.style = "filled";

        //Assigning values to the triangle 2 object.
        triangle2.width = 8.0;
        triangle2.height = 12.0;
        triangle2.style = "outlined";

        //Displaying values of triangle 1.
        System.out.println("Info for triangle1: ");
        triangle1.showStyle();
        triangle1.showDimensions();
        System.out.println("Area is : " + triangle1.area());

        //Displaying values of triangle 2.
        System.out.println("\nInfo for triangle2: ");
        triangle2.showStyle();
        triangle2.showDimensions();
        System.out.println("Area is : " + triangle2.area());

        //Assigning values to rectangle class.
        rectangle.width = 8.0;
        rectangle.height = 8.0;

        //Displaying values of rectangle.
        System.out.println("\nInfo for rectangle: ");
        System.out.println("Is this square: " + rectangle.isSquare());
        System.out.println("Area is : " + rectangle.area());
    }
}
