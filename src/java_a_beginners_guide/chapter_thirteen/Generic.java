package java_a_beginners_guide.chapter_thirteen;

/**
 * A simple generic class.
 * Here, T is a type parameter that will be replaced
 * by a real type when an object of type Generic is created.
 * @param <E>: a placeholder.
 */
public class Generic<E> {
    E object; //Declare an object of type T.

    /**
     * Pass the constructor a reference to an object
     * of type T.
     * @param object: reference of type T.
     */
    Generic(E object) {
        this.object = object;
    }

    /**
     * Method to return the reference of type T.
     * @return reference of type T.
     */
    E getObject() {
        return object;
    }

    /**
     * Show type of T.
     */
    public void showType() {
        System.out.println("Type of T is: " + object.getClass().getName());
    }
}
