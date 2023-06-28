package java_a_beginners_guide.chapter_seven;

public class Triangle extends TwoDShape{
    //Instance fields.
    public String style;

    /**
     * Method to calculate the area of a triangle.
     * @return area
     */
    public double area() {
        return width * height / 2;
    }

    /**
     * Method to show the style of a triangle object.
     * like filled, curved and more.
     */
    public void showStyle() {
        System.out.println("Triangle is : " + style);
    }
}
