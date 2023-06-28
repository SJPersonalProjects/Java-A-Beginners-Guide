package java_a_beginners_guide.chapter_six;

/**
 * This program demonstrates the process of method overloading
 * and how does it work when type conversion takes place.
 */
public class MethodOverloadingDemonstrationV2 {
    public static void main(String[] args) {
        MethodOverloadingV2 overloadingV2 = new MethodOverloadingV2();

        int valueInteger = 10;
        double valueDouble = 10.0;

        byte valueByte = 99;
        short valueShort = 10;
        float valueFloat = 11.5F;

        overloadingV2.f(valueInteger); //Calls overloadingV2.f(int).
        overloadingV2.f(valueDouble); //Calls overloadingV2.f(double).

        overloadingV2.f(valueByte); //Calls overloadingV2.f(int) - type conversion.
        overloadingV2.f(valueShort); //Calls overloadingV2.f(int) - type conversion.
        overloadingV2.f(valueFloat); //Calls overloadingV2.f(double) - type conversion.


    }
}
