package java_a_beginners_guide.chapter_seven;

public class TriangleV6 extends TwoDShapeV6{
    //Instance fields.
    private String mStyle;

    /**
     * Default constructor to initialize the object of Triangle shape.
     */
    public TriangleV6() {
        super();
        mStyle = "none";
    }

    /**
     * Parameterized constructor to initialize the triangleV6 object.
     * @param mWidth: width of the triangle.
     * @param mHeight: height of the triangle.
     * @param mStyle: style of the triangle.
     */
    public TriangleV6(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight);
        this.mStyle = mStyle;
    }

    /**
     * Single argument constructor to initialize the TwoDShapeV6 object with
     * @param valueX: single value to initialize the object.
     */
    public TriangleV6(double valueX) {
        super(valueX);
        mStyle = "Filled";
    }

    /**
     * Method to calculate the area of a triangle.
     * @return area.
     */
    double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to show the style of a triangle.
     */
    void showStyle() {
        System.out.println("Triangle is : " + mStyle);
    }
}
