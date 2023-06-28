package java_a_beginners_guide.chapter_seven;

public class TriangleV8 extends TwoDShapeV8{
    //Instance fields.
    private String mStyle;

    /**
     * Default constructor to initialize the triangle object
     * with default values.
     */
    public TriangleV8() {
        super();
        mStyle = "none";
    }

    /**
     * Parameterized constructor to initialize the object of Triangle.
     * @param mWidth: width of triangle.
     * @param mHeight: height of triangle.
     * @param mStyle: style of triangle.
     */
    public TriangleV8(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight, "Triangle");
        this.mStyle = mStyle;
    }

    /**
     * Single-parameter constructor to initialize the object
     * with single value for dimensions.
     * @param valueX: value for all dimensions of an object.
     */
    public TriangleV8(double valueX) {
        super(valueX, "Triangle");
        mStyle = "Filled";
    }

    /**
     * Construct a triangle object with an object.
     * @param triangleObject: object of type TriangleV8.
     */
    public TriangleV8(TriangleV8 triangleObject) {
        super(triangleObject);
        this.mStyle = triangleObject.mStyle;
    }

    /**
     * Method to calculate the area of triangle shape.
     * @return area.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to show the style of a triangle.
     */
    public void showStyle() {
        System.out.println("Triangle is: " + mStyle);
    }
}
