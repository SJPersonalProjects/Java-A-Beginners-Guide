package java_a_beginners_guide.chapter_fourteen;

import java.util.function.Predicate;

public class PredicateInterfaceInAction {
    public static void main(String[] args) {
        //This lambda uses Predicate<Integer> to determine if a number is even.
        Predicate<Integer> predicateInterface = (value) -> (value % 2) == 0;

        //Using for loop to determine the even number from 1 to 10.
        for(int i = 1; i <= 10; i++) {
            //Testing the number using pre-defined interface called Predicate<T>
            if(predicateInterface.test(i))
                System.out.println(i + " is an even number");
        }
    }
}
