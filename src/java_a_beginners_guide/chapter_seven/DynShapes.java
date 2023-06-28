package java_a_beginners_guide.chapter_seven;

public class DynShapes {
    public static void main(String[] args) {
        //1D array of type TwoDShapeV8
        TwoDShapeV8[] shapes = new TwoDShapeV8[5];

        //Inserting the object's info in each part of array.
        shapes[0] = new TriangleV8(8.0, 12.0, "Outlined");
        shapes[1] = new RectangleV8(10);
        shapes[2] = new RectangleV8(10, 4);
        shapes[3] = new TriangleV8(7.0);
        shapes[4] = new TwoDShapeV8(10, 20, "Generic");

        //Using for loop to retrieve the all objects information as console output.
        for(int a = 0; a < shapes.length; a++) {
            System.out.println("Object is: " + shapes[a].getName());
            System.out.println("Area is: " + shapes[a].area());
            System.out.println();
        }
    }
}
