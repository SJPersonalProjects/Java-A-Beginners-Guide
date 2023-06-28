package java_a_beginners_guide.chapter_thirteen;

public class UseBoundedWildcard {
    //Here, the ? will match A or any class type
    //that extends A.
    public static void test(Generic<? extends A> object) {
        System.out.println("It's a bounded wildcard test.");
    }

    public static void main(String[] args) {

        //Classes objects.
        A a = new A();  //Super class of B and C.
        B b = new B(); //B extends A with a constructor that says ("B class.");
        C c = new C(); //C extends A with a constructor that says ("C class.");
        D d = new D(); //D doesn't extend A.

        //Generic is a simple class.
        Generic<A> w = new Generic<>(a);
        Generic<B> w2 = new Generic<>(b);
        Generic<C> w3 = new Generic<>(c);
        Generic<D> w4 = new Generic<>(d);

        //These calls to test are OK.
        test(w);
        test(w2);
        test(w3);

        //Can't call test() with w4 because
        //it is not an object of a class that inherits A.
        //test(w4);



    }
}
