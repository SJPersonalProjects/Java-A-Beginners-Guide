package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV3 {
    //Instance fields.
    private double mWidth;
    private double mHeight;

    /**
     * Method to set the width of a shape.
     * @param mWidth: width of a shape.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of a shape.
     * @return width of a shape.
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
     * @return height of a shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to show the dimensions of a given shape.
     */
    public void showDimension() {
        System.out.println("Height and Width are : " +
                mHeight + " and " + mWidth);
    }
}
