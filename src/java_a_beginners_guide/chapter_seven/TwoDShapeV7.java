package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV7 {
    //Instance fields.
    private double mWidth;
    private double mHeight;

    /**
     * Parameterless constructor to initialize the object with the same values.
     */
    public TwoDShapeV7() {
        mWidth = mHeight = 0.0;
    }

    /**
     * Parameterized constructor to initialize the TwoDShape object.
     * @param mWidth: width of the 2 dimensional shape.
     * @param mHeight: height of the 2 dimensional shape.
     */
    public TwoDShapeV7(double mWidth, double mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    /**
     * Parameterized constructor to initialize the TwoDShape object with the same
     * value passed as parameter.
     * @param valueX: value passed as single parameter.
     */
    public TwoDShapeV7(double valueX) {
        mWidth = mHeight = valueX;
    }

    /**
     * Construct an object from an object.
     * @param twoDShape: object of TwoDShape.
     */
    public TwoDShapeV7(TwoDShapeV7 twoDShape) {
        mWidth = twoDShape.mWidth;
        mHeight = twoDShape.mHeight;
    }

    /**
     * Accessor methods for width and height.
     *
     * Method to set the value to the width of 2 dimensional shape.
     * @param mWidth: width of 2D shape.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of the 2 dimensional shape.
     * @return width of 2D shape.
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Method to set the height of 2 dimensional shape.
     * @param mHeight: height of 2D shape.
     */
    public void setHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Method to get the height of 2 dimensional shape.
     * @return height of 2D shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to show the dimensions of 2 dimensional shape.
     */
    public void showDimensions() {
        System.out.println("Width and Height are: " +
                mWidth + " and " + mHeight);
    }
}
