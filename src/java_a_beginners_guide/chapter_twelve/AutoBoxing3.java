package java_a_beginners_guide.chapter_twelve;

public class AutoBoxing3 {
    public static void main(String[] args) {
        Integer integerObjectOne, integerObjectTwo;
        int integerValue;

        integerObjectOne = 99;
        System.out.println("Original value of integerObjectOne: " + integerObjectOne); //prints 99.

        //The following automatically unboxes integerObjectOne,
        //performs the increment, and then reboxes
        //the result back to integerObjectOne.
        ++integerObjectOne;
        System.out.println("After ++integerObjectOne: " + integerObjectOne); //100.

        //Here, integerObjectOne is unboxed, its value is increased by 10,
        //and the result is boxes and stored back to integerObjectOne.
        integerObjectOne += 10;
        System.out.println("After integerObjectOne += 10: " + integerObjectOne); //110.

        //Here, integerObjectOne is unboxed, the expression is evaluated,
        //and the result is reboxed and assigned to integerObjectTwo.
        integerObjectTwo = integerObjectOne + (integerObjectOne / 3);
        System.out.println("integerObjectTwo after expression: " + integerObjectTwo); //146.

        //The same expression is evaluated but the result is not reboxed.
        integerValue = integerObjectOne + (integerObjectOne / 3);
        System.out.println("integerValue after expression: " + integerValue); //146.
    }
}
