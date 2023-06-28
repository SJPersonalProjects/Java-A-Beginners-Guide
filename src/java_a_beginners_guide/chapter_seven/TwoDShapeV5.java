package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV5 {
    //Instance fields.
    private double mWidth;
    private double mHeight;

    /**
     * A default constructor.
     */
    public TwoDShapeV5() {
        mWidth = mHeight = 0.0;
    }

    /**
     * Construct object with equal value of width and height.
     * @param valueX: same value for width and height of a shape.
     */
    public TwoDShapeV5(double valueX) {
        mWidth = mHeight = valueX;
    }

    /**
     * Parameterized constructor to initialize object of shape with different values.
     * @param mWidth: width of a shape.
     * @param mHeight: height of a shape.
     */
    public TwoDShapeV5(double mWidth, double mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    /**
     * Method to set the width of a shape.
     * @param mWidth: value of width of a shape.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of a shape.
     * @return mWidth: width of a shape.
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Method to set the height value to the shape.
     * @param mHeight: height of a shape.
     */
    public void setHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Method to get the height of a shape.
     * @return mHeight: height of a shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to show the dimensions of a shape.
     */
    public void showDimensions() {
        System.out.println("Width and Height are : " +
                mWidth + " and " + mHeight);
    }
}
