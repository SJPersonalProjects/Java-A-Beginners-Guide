package java_a_beginners_guide.chapter_seven;

public class TriangleV7 extends TwoDShapeV7{
    //Instance fields.
    private String mStyle;

    /**
     * Parameterless constructor to initialize the Triangle object
     * with basically no values.
     */
    public TriangleV7() {
        super();
        mStyle = "none";
    }

    /**
     * Parameterized constructor to initialize the Triangle object.
     * @param mWidth: width of triangle object.
     * @param mHeight: height of triangle object.
     * @param mStyle: style of the triangle object.
     */
    public TriangleV7(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight);
        this.mStyle = mStyle;
    }

    /**
     * Single-parameter constructor to initialize the TwoDShape object with
     * same value and Triangle object style with hard-coded value.
     * @param valueX: single value for 2 dimensional objects.
     */
    public TriangleV7(double valueX) {
        super(valueX);
        mStyle = "Filled";
    }

    public TriangleV7(TriangleV7 triangle) {
        super(triangle);
        mStyle = triangle.mStyle;
    }

    /**
     * Method to set the value to Triangle style.
     * @param mStyle: style of the triangle object.
     */
    public void setStyle(String mStyle) {
        this.mStyle = mStyle;
    }

    /**
     * Method to get the value of Triangle style.
     * @return style of the triangle.
     */
    public String getStyle() {
        return mStyle;
    }

    /**
     * Method to calculate and return the area of 2 dimensional shape.
     * @return the area of triangle.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to display the Triangle style as console output.
     */
    public void showStyle() {
        System.out.println("Triangle is: " + mStyle);
    }
}
