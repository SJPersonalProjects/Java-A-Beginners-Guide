package java_a_beginners_guide.chapter_six;

public class StaticDemonstration {
    public static void main(String[] args) {
        //Static class objects.
        Static staticObject1 = new Static();
        Static staticObject2 = new Static();

        //Each object has its own copy of instance variable.
        staticObject1.valueX = 10;
        staticObject2.valueX = 20;

        System.out.println("Of course, staticObject1.valueX and staticObject2.valueX are independent.");
        System.out.println("staticObject1.valueX: " + staticObject1.valueX +
                "\nstaticObject2.valueX: " + staticObject2.valueX); //Displaying instance fields on the console.

        System.out.println(); //For a gap of line.

        //Each object shares one copy of a static variable.
        System.out.println("The static variable valueY is shared.");
        Static.valueY = 19;

        System.out.println("Set Static.valueY to 19.");

        System.out.println("Sum of staticObject1.sum(): " + staticObject1.sum()); //Printing the sum of both global variables.
        System.out.println("Sum of staticObject2.sum(): " + staticObject2.sum()); //Printing the sum of both global variables.
        System.out.println(); //For a gap of line.

        Static.valueY = 100; //Setting the static variable to 100.
        System.out.println("Changing the Static.valueY to 100.");

        //Printing the sum of both global variables after resetting.
        System.out.println("Sum of staticObject1.sum() : " + staticObject1.sum());
        System.out.println("Sum of staticObject2.sum() : " + staticObject2.sum());
        System.out.println(); //For a gap of line.
    }
}
