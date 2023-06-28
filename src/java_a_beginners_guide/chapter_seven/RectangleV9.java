package java_a_beginners_guide.chapter_seven;

public class RectangleV9 extends TwoDShapeV9{

    /**
     * A default constructor to initialize the object with no values.
     */
    public RectangleV9() {
        super();
    }

    /**
     * Parameterized constructor to initialize the object with different dimensions.
     * @param mWidth: width of a rectangle.
     * @param mHeight: height of a rectangle.
     */
    public RectangleV9(double mWidth, double mHeight) {
        super(mWidth, mHeight, "Rectangle");
    }

    /**
     * A parameterized constructor to initialize the object with same value
     * of dimensions.
     * @param valueX: single value for all sides of the 2D shape.
     */
    public RectangleV9(double valueX) {
        super(valueX, "Rectangle");
    }

    /**
     * Parameterized constructor to initialize the object with
     * similar values of another object.
     * @param object of type RectangleV9
     */
    public RectangleV9(RectangleV9 object) {
        super(object);
    }

    /**
     * Method to check if the 2D shape rectangle is equal from both sides.
     * @return boolean expression based on the result of rectangle dimensions.
     */
    public boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }

    /**
     * Method to calculate the area of rectangle.
     * @return area.
     */
    @Override
    public double area() {
        return getWidth() * getWidth();
    }
}
