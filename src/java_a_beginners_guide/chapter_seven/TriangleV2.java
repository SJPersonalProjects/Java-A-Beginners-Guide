package java_a_beginners_guide.chapter_seven;

public class TriangleV2 extends TwoDShapeV2{
    //Instance field.
    private String style;

    /**
     * Method to set the style of a triangle.
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Method to get the style of a triangle.
     * @return triangle style.
     */
    public String getStyle() {
        return style;
    }

    /**
     * Method to calculate the area of Triangle.
     * @return triangle area.
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    public void showStyle() {
        System.out.println("Triangle is : " + style);
    }
}
