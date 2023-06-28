package java_a_beginners_guide.chapter_seven;

public class RectangleV8 extends TwoDShapeV8{

    /**
     * A default constructor.
     */
    public RectangleV8() {
        super();
    }

    /**
     * A parameterized constructor to initialize the rectangle object
     * with different dimensional values.
     * @param mWidth: width of rectangle.
     * @param mHeight: height of rectangle.
     */
    public RectangleV8(double mWidth, double mHeight) {
        super(mWidth, mHeight, "Rectangle");
    }

    /**
     * Single-parameter constructor to initialize the Rectangle object
     * with equal dimensional values.
     * @param valueX: value to equally assign for dimensions.
     */
    public RectangleV8(double valueX) {
        super(valueX, "Rectangle");
    }

    /**
     * Construct an object from an object.
     * @param rectangleV8: RectangleV8 type object passed to create the same object.
     */
    public RectangleV8(RectangleV8 rectangleV8) {
        super(rectangleV8);
    }

    /**
     * Method to check if the dimensions of Rectangle are equal
     * return true otherwise false.
     * @return boolean expression based on the dimensions of a rectangle.
     */
    public boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    /**
     * Method to calculate the area of a rectangle.
     * @return area of rectangle.
     */
    public double area() {
        return getWidth() * getHeight();
    }
}
