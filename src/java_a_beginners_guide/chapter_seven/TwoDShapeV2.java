package java_a_beginners_guide.chapter_seven;

public class TwoDShapeV2 {
    //Instance fields.
    private double width;
    private double height;

    //Accessor methods.

    /**
     * Method to set the width to the private width.
     * @param width of any shape.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Method to get the width of any shape.
     * @return width of a given shape.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Method to set the height of any shape.
     * @param height of any given shape.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Method to get the height of any shape.
     * @return the height of shape.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Method to show the dimensions of a shape.
     */
    public void showDimensions() {
        System.out.println("Height and width are : " +
                height + " and " + width);
    }
}
