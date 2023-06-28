package java_a_beginners_guide.chapter_seven;

public class AbsShapes {
    public static void main(String[] args) {
        //1D array of type TwoDShapesV9.
        TwoDShapeV9[] shapes = new TwoDShapeV9[4];

        //A superclass reference can refer to the subclass object.
        shapes[0] = new TriangleV9(8.0, 12.0, "Outlined");
        shapes[1] = new RectangleV9(10);
        shapes[2] = new RectangleV9(10, 4);
        shapes[3] = new TriangleV9(7.0);


        for(int i = 0; i < shapes.length; i++) {
            System.out.println("Object is: " +
                    shapes[i].getName());
            System.out.println("Area is: " + shapes[i].area()); //to get the area of each object.
            System.out.println(); //For a gap of line.
        }
    }
}
