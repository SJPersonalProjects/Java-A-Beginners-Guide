package java_a_beginners_guide.chapter_six;

public class InnerClassDemonstration {
    public static void main(String[] args) {

        //1D array of type integer.
        int[] arrayElements = {1, 10, 8, 6, 100, 26, 776, 22, 4, 3, 5};

        //Outer class object.
        OuterClass outerClass = new OuterClass(arrayElements);

        outerClass.analyze(); //Finding the minimum, maximum and average values from the given array.
    }
}
