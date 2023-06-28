package java_a_beginners_guide.chapter_seven;

public abstract class TwoDShapeV9 {
    //Instance fields.
    private double mWidth;
    private double mHeight;
    private String mName;

    /**
     * A default constructor.
     * To initialize the object with default values.
     */
    public TwoDShapeV9() {
        mWidth = mHeight = 0.0;
        mName = "None";
    }

    /**
     * Parameterized constructor to initialize the object with different values.
     * @param mWidth: width of a 2D shape.
     * @param mHeight: height of a 2D shape.
     * @param mName: name of a 2D shape.
     */
    public TwoDShapeV9(double mWidth, double mHeight, String mName) {
        this.mWidth = mWidth;
        this.mHeight = mHeight;
        this.mName = mName;
    }

    /**
     * Parameterized constructor to initialize the object dimensions with similar values.
     * @param valueX: dimensions of 2D shape.
     * @param mName: name of 2D shape.
     */
    public TwoDShapeV9(double valueX, String mName) {
        mWidth = mHeight = valueX;
        this.mName = mName;
    }

    /**
     * Parameterized constructor to construct an object from an object.
     * @param twoDShape: object of type TwoDShapeV9.
     */
    public TwoDShapeV9(TwoDShapeV9 twoDShape) {
        this.mWidth = twoDShape.mWidth;
        this.mHeight = twoDShape.mHeight;
        this.mName = twoDShape.mName;
    }

    /**
     * Method to set the width of 2D shape.
     * @param mWidth: width of a 2D shape.
     */
    public void setWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    /**
     * Method to get the width of 2D shape.
     * @return width of 2D shape.
     */
    public double getWidth() {
        return mWidth;
    }

    /**
     * Method to set the height of 2D shape.
     * @param mHeight: height of 2D shape.
     */
    public void setHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    /**
     * Method to get the height of 2D shape.
     * @return height of 2D shape.
     */
    public double getHeight() {
        return mHeight;
    }

    /**
     * Method to set the name of 2D shape.
     * @param mName: name of 2D object.
     */
    public void setName(String mName) {
        this.mName = mName;
    }

    /**
     * Method to get the name of 2D object.
     * @return name of 2D object.
     */
    public String getName() {
        return mName;
    }

    /**
     * Method to displays the dimensions of 2D shape as console output.
     */
    public void showDimensions() {
        System.out.println("Width and Height are: " +
                mWidth + " and " + mHeight);
    }

    /**
     * Abstract method to calculate the area of 2D shape.
     * @return area of 2D shape.
     */
    public abstract double area();
}
