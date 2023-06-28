package java_a_beginners_guide.chapter_seven;

public class Rectangle extends TwoDShape{
    /**
     * method to check if the dimensions are equal to create a perfect rectangle.
     * @return boolean condition
     */
    public boolean isSquare() {
        if(width == height) return true;
        return false;
    }

    /**
     * Method to calculate the area of rectangle.
     * @return area of rectangle.
     */
    public double area() {
        return width * height;
    }
}
