package java_a_beginners_guide.chapter_seven;

public class TriangleV9 extends TwoDShapeV9{
    //Instance fields.
    private String mStyle;

    /**
     * A default constructor to initialize the object with default values.
     */
    public TriangleV9() {
        super();
        mStyle = "None";
    }

    /**
     * A parameterized constructor to initialize the object with different values.
     * @param mWidth: width of a 2D shape.
     * @param mHeight: height of a 2D shape.
     * @param mStyle: style of a 2D shape.
     */
    public TriangleV9(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight, "Triangle");
        this.mStyle = mStyle;
    }

    /**
     * A parameterized constructor to initialize the object with same dimensions.
     * @param valueX: dimension for a 2D shape.
     */
    public TriangleV9(double valueX) {
        super(valueX, "Triangle");
        mStyle = "Filled";
    }

    /**
     * Parameterized constructor to initialize the object with the
     * values of the same object.
     * @param triangle: reference of TriangleV9.
     */
    public TriangleV9(TriangleV9 triangle) {
        super(triangle);
        this.mStyle = triangle.mStyle;
    }

    /**
     * Method to show the style of triangle as console output.
     */
    public void showStyle() {
        System.out.println("Triangle is: " + mStyle);
    }

    /**
     * Method to calculate the area of Triangle.
     * @return area of triangle.
     */
    @Override
    public double area() {
        return getWidth() * getHeight() / 2;
    }
}
