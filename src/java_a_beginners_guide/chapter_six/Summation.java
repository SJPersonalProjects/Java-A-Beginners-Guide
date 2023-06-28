package java_a_beginners_guide.chapter_six;

public class Summation {
    //Instance field.
    public int sumOfValue;

    /**
     * Parameterized constructor to initialize the object.
     * Find the sum of numbers from 0 to given ones.
     * @param givenNumber: number till sum would be calculated.
     */
    public Summation(int givenNumber) {
        sumOfValue = 0;
        for(int i = 1; i <= givenNumber; i++) sumOfValue += i;
    }

    /**
     * Parameterized constructor to assign the value of one object to another.
     * @param object: object of summation class.
     */
    public Summation(Summation object) {
        sumOfValue = object.sumOfValue;
    }
}
