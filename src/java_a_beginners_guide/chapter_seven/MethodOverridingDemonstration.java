package java_a_beginners_guide.chapter_seven;

public class MethodOverridingDemonstration {
    public static void main(String[] args) {
        //MethodOverridingSub class object.
        MethodOverridingSub methodOverriding = new MethodOverridingSub(10, 20, 30);

        methodOverriding.showValues(); //This method shows the values from the sub-class.

        System.out.println(); // for a gap of line.

        MethodOverriding methodOverriding1 = new MethodOverriding(50, 100);
        methodOverriding1.showValues(); // this method shows the values form the super-class.
    }
}
