package java_a_beginners_guide.chapter_seven;

public class TriangleV4 extends TwoDShapeV4{
    //Instance field.
    private String mStyle;

    /**
     * Constructor to initialize the object of TriangleV4.
     * @param mWidth: width of a triangle.
     * @param mHeight: height of a triangle.
     * @param mStyle: style of a triangle.
     */
    public TriangleV4(double mWidth, double mHeight, String mStyle) {
        super(mWidth, mHeight);
        this.mStyle = mStyle;
    }

    /**
     * Method to set the style of a triangle.
     * @param mStyle: style of a triangle.
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
     * Method to calculate the area of a triangle.
     * @return area of a triangle.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to display the style of a triangle.
     */
    public void showStyle() {
        System.out.println("Triangle is : " + mStyle);
    }
}
