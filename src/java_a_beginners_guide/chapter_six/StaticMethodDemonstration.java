package java_a_beginners_guide.chapter_six;

public class StaticMethodDemonstration {
    public static void main(String[] args) {

        System.out.println("StaticMethod.value: " + StaticMethod.value); //Printing the value on console.
        System.out.println("StaticMethod.valueDivideBy2(): " +
                StaticMethod.valueDivideBy2());

        StaticMethod.value = 4; //Changing the value...


        System.out.println("StaticMethod.value: " + StaticMethod.value); //Printing the value.
        System.out.println("StaticMethod.valueDivideBy2(): " +
                StaticMethod.valueDivideBy2()); //Dividing the value by 2.

    }
}
