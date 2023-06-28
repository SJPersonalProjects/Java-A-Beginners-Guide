package java_a_beginners_guide.chapter_seven;

public class TriangleV5 extends TwoDShapeV5{
    //Instance field.
    private String mStyle;

    /**
     * A default constructor.
     */
    public TriangleV5() {
        super();
        mStyle = "none";
    }

    /**
     * Parameterized constructor to initialize the TriangleV5 object with different values.
     * @param mWidth: width of a triangle shape.
     * @param mHeight: height of a triangle shape.
     * @param mStyle: style of a triangle shape.
     */
    public TriangleV5(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight);
        this.mStyle = mStyle;
    }

    /**
     * Single parameter constructor.
     * @param valueX
     */
    public TriangleV5(double valueX) {
        super(valueX);
        mStyle = "Filled";
    }

    /**
     * Method to set the style of a triangle.
     * @param mStyle: value of a style for triangle shape.
     */
    public void setStyle(String mStyle) {
        this.mStyle = mStyle;
    }

    /**
     * Method to get the style of a triangle.
     * @return mStyle: style of a triangle.
     */
    public String getStyle() {
        return mStyle;
    }

    /**
     * Method to calculate the area of a triangle shape.
     * @return triangle area.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to show the style of a triangle as a console output.
     */
    public void showStyle() {
        System.out.println("Triangle is : " + mStyle);
    }
}
