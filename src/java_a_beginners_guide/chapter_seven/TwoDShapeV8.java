package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV8 {
    //Instance fields.
    private double mWidth;
    private double mHeight;
    private String mName;

    /**
     * Default constructor to initialize the object with
     * specific values.
     */
    public TwoDShapeV8() {
        mWidth = mHeight = 0.0;
        mName = "none";
    }

    /**
     * Parameterized constructor to initialize the object
     * of TwoDShapeV8.
     * @param mWidth: width of 2d shape.
     * @param mHeight: height of 2d shape.
     * @param mName: name of 2d shape.
     */
    public TwoDShapeV8(double mWidth, double mHeight, String mName) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mName = mName;
    }

    /**
     * Parameterized constructor to initialize the object with specific
     * values passed as parameters.
     * @param valueX: value for the dimensions of the 2d shape.
     * @param mName: name of the 2d shape.
     */
    public TwoDShapeV8(double valueX, String mName) {
        mWidth = mHeight = valueX;
        this.mName = mName;
    }

    /**
     * Construct an object from an object.
     * @param towDShapeObject: an object of type TwoDShapeV8 to construct a similar object.
     */
    public TwoDShapeV8(TwoDShapeV8 towDShapeObject) {
        this.mWidth = towDShapeObject.mWidth;
        this.mHeight = towDShapeObject.mHeight;
        this.mName = towDShapeObject.mName;
    }

    /**
     * Method to set the width of 2D shape object.
     * @param mWidth: width for 2D shape object.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of 2D shape object.
     * @return width
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Method to set the height to 2D shape object.
     * @param mHeight: height for 2D object.
     */
    public void setHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Method to get the height of 2D shape object.
     * @return height of 2D shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to set the name of 2D shape object.
     * @param mName: name of 2D shape.
     */
    public void setName(String mName) {
        this.mName = mName;
    }

    /**
     * Method to get the name of 2D shape object.
     * @return mName: of 2D shape.
     */
    public String getName() {
        return mName;
    }

    /**
     * Method to show the dimensions of 2D shape object.
     */
    public void showDimensions() {
        System.out.println("Width and Height are : " +
                mWidth + " and " + mHeight);
    }

    /**
     * Method to calculate the area of 2D shape object.
     * @return area for 2 dimensional shape.
     */
    public double area() {
        return mWidth * mHeight / 2;
    }
}