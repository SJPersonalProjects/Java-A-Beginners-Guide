package java_a_beginners_guide.chapter_four;

public class CheckNumber {
    //Method to verify if the number is even.
    //If returns true if it is, otherwise, it returns false.
    public boolean isEven(int number) {
        //if number is even returns true.
        if(number % 2 == 0) return true;

        //It returns false otherwise.
        return false;
    }
}
