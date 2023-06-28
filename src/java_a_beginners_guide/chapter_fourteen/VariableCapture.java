package java_a_beginners_guide.chapter_fourteen;

/**
 * this program illustrates the concept of variable capture.
 */
public class VariableCapture {
    public static void main(String[] args) {
        //A local variable that can be captured.
        int number = 10;

        MyFunction myLambda = (value) -> {
            //This use of number is OK. It doesn't modify number.
            int v = number + value;

            //However, the following is illegal because it attempts
            //to modify the value of number.
            //number++;

            return v;
        };

        //Use the lambda. This will display 28.
        System.out.println(myLambda.function(18));

        //This following line would also cause an error, because
        //it would remove the effectively final status from number.
        //number = 9;
    }
}
