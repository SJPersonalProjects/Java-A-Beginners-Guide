package java_a_beginners_guide.chapter_six;

public class CallByValue {
    public static void main(String[] args) {
        CallByValueTest  callByValueTest = new CallByValueTest();

        int a = 10, b = 20;

        System.out.println("a and b before call : " +
                a + " " + b);

        callByValueTest.noChange(a , b); //Method is called to try to change the values of the given arguments.

        System.out.println("a and b after call : " +
                a + " " + b);
    }
}
