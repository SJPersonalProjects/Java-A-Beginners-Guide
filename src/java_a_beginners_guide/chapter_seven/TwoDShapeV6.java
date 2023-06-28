package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV6 {
    //Instance fields.
    private double mWidth;
    private double mHeight;

    /**
     * Default constructor to initialize TwoDShapeV6 object with 0.0 value.
     */
    public TwoDShapeV6() {
        mWidth = mHeight = 0.0;
    }

    /**
     * Parameterized constructor to initialize the TwoDShapeV6 object.
     * @param mWidth: width of the 2 dimensional shape.
     * @param mHeight: height of the 2 dimensional shape.
     */
    public TwoDShapeV6(double mWidth, double mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    /**
     * Parameterized constructor to initialize the TwoDShapeV6 object with the same value.
     * @param valueX: value to initialize the object's attributes with equal value.
     */
    public TwoDShapeV6(double valueX) {
        mWidth = mHeight = valueX;
    }

    /**
     * Method to set the width of a 2 dimensional shape.
     * @param mWidth: width of a shape.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of a 2 dimensional shape.
     * @return width of a shape.
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Method to set the height of the 2 dimensional shape.
     * @param mHeight: height of a shape.
     */
    public void setHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Method to get the height of the 2 dimensional shape.
     * @return height of the shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to show the dimensions of a shape.
     */
    public void showDimensions() {
        System.out.println("Width and Height are " +
                mWidth + " and " + mHeight);
    }
}
