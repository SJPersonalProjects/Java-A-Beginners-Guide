package java_a_beginners_guide.chapter_thirteen;

/**
 * A simple generic class with two types
 * parameters E and V.
 */
public class TwoGenerics<E, V> {
    //Instance object references.
    E objectOne;
    V objectTwo;

    /**
     * Pass the constructors references to objects of type E and V.
     * @param objectOne: object of type E.
     * @param objectTwo: object of type V.
     */
    public TwoGenerics(E objectOne, V objectTwo) {
        this.objectOne = objectOne;
        this.objectTwo = objectTwo;
    }

    /**
     * Show types of objects E and V.
     */
    public void showTypes() {
        System.out.println("Type of E is: " + objectOne.getClass().getName() +
                "\nType of V is: " + objectTwo.getClass().getName());
    }

    //Get the object of type E.
    public E getObjectOne() {
        return objectOne;
    }

    //Get the object of type V.
    public V getObjectTwo() {
        return objectTwo;
    }
}
