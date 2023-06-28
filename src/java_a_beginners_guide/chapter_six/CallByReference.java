package java_a_beginners_guide.chapter_six;

public class CallByReference {
    public static void main(String[] args) {
        CallByReferenceTest object = new CallByReferenceTest(5 , 10);

        System.out.println("Object.valueOne and Object.valueTwo before call : " +
                object.valueOne + " " + object.valueTwo);

        object.change(object);

        System.out.println("Object.valueOne and Object.valueTwo after call : " +
                object.valueOne + " " + object.valueTwo);
    }
}
