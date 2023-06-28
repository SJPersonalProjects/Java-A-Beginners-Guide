package java_a_beginners_guide.chapter_fourteen;

public class MethodReferenceDemonstration {
    public static void main(String[] args) {
        boolean result;

        MyIntegerNumber myNumber = new MyIntegerNumber(12);
        MyIntegerNumber myNumber2 = new MyIntegerNumber(16);



        //Here, a method reference to isFactor on myNumber is created.
        IntegerPredicate integerPredicate = myNumber::isFactor;

        //Now, it is used to call isFactor() via test().
        result = integerPredicate.test(3);
        if(result) System.out.println("3 is a factor of: " + myNumber.getValue());





        IntegerPredicate integerPredicate1 = (value) -> {
            boolean resul = myNumber.isFactor(4);

            return resul;
        };

        boolean answer = integerPredicate1.test(4);
        if(answer) System.out.println("4 is a factor of : " + myNumber.getValue());






        //This time, a method reference to isfactor on myNumber2 is created.
        //And used to call isFactor() via test().
        integerPredicate = myNumber2::isFactor;
        result = integerPredicate.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNumber2.getValue());
    }
}
