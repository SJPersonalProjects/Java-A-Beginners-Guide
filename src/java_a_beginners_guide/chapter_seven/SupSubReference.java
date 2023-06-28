package java_a_beginners_guide.chapter_seven;

public class SupSubReference {
    public static void main(String[] args) {
        X objectX = new X(10);
        Y objectY = new Y(10, 100);

        X objectX1;

        objectX1 = objectX; //this is valid and can compile.
        System.out.println("Value of objectX: " + objectX.getValueX() +
                "\nValue of objectX1: " + objectX1.getValueX());

        objectX1 = objectY;

        //After objectY is assigned to objectX1.
        System.out.println("ObjectX1 value now: " + objectX1.getValueX());

        objectX1.setValueX(11);
        //objectX1.setValueY(); it doesn't recognize the valueY member of objectY.

        System.out.println("ObjectX1.valueX: After assignment " + objectX1.getValueX());
    }
}
