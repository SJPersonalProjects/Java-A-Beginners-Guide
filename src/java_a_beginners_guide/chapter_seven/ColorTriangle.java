package java_a_beginners_guide.chapter_seven;

public class ColorTriangle extends TriangleV6{
    //Instance fields.
    private String mColor;

    /**
     * Parameterized constructor to initialize the ColorTriangle object.
     * @param mWidth: width of a triangle.
     * @param mHeight: height of a triangle.
     * @param mStyle: style of a triangle.
     * @param mColor: color of a triangle.
     */
    public ColorTriangle(double mWidth, double mHeight, String mStyle, String mColor) {
        //TriangleV6 constructor to initialize the object...
        super(mWidth, mHeight, mStyle);
        this.mColor = mColor;
    }

    /**
     * Method to get the color of a triangle.
     * @return color of a triangle.
     */
    public String getColor() {
        return mColor;
    }

    /**
     * Method to show the
     */
    public void showColor() {
        System.out.println("Color is : " + mColor);
    }
}