package java_a_beginners_guide.chapter_seven;

public class TriangleV3 extends TwoDShapeV3{
    //Instance fields.
    private String mStyle;

    /**
     * Constructor to initialize the Triangle object.
     * @param width: width of a triangle.
     * @param height: height of a triangle.
     * @param mStyle: style of a triangle.
     */
    public TriangleV3(double width, double height, String mStyle) {
        setWidth(width);
        setHeight(height);
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
     * @return style of a triangle.
     */
    public String getStyle() {
        return mStyle;
    }

    /**
     * Method to calculate the area of the triangle.
     * @return area of triangle.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    /**
     * Method to show the style of a triangle.
     */
    public void showStyle() {
        System.out.println("Triangle is : " + mStyle);
    }
}
