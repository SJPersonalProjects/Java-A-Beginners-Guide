package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV4 {
    //Instance fields.
    private double mWidth;
    private double mHeight;

    /**
     * Constructor to initialize the object of TwoDShapeV4
     * @param mWidth: width of the TwoDShape object.
     * @param mHeight: height of the TwoDShape object.
     */
    public TwoDShapeV4(double mWidth, double mHeight) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    /**
     * Method to set the width of a shape.
     * @param mWidth: width of a shape.
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
     * Method to set the height of a shape.
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
     * Method to show the dimensions of a given shape.
     */
    public void showDimensions() {
        System.out.println("Width and Height are : " +
                mWidth + " and " + mHeight);
    }
}
