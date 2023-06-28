package java_a_beginners_guide.chapter_seven;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Classes objects.
        SuperClass superClass = new SuperClass();
        SubClass1 subClass1 = new SubClass1();
        SubClass2 subClass2 = new SubClass2();

        SuperClass superClassReference;

        superClassReference = superClass;
        superClassReference.who(); //this calls the who() method from the super-class.

        superClassReference = subClass1;
        superClassReference.who(); //this calls the who() method from the sub-class 1.

        superClassReference = subClass2;
        superClassReference.who(); //this calls the who() method from the sub-class 2.
    }
}
