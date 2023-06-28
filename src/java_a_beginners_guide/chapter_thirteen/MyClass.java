package java_a_beginners_guide.chapter_thirteen;

/**
 * Implements Containment using an array to
 * hold the values.
 * @param <T>
 */
public class MyClass<T extends Number> implements Containment<T>{
    T[] arrayReference;

    MyClass(T[] arrayReference) {
        this.arrayReference = arrayReference;
    }

    //Implementing contains() method.
    @Override
    public boolean contains(T object) {
        for(T x : arrayReference) {
            if(x.equals(object)) {
                return true;
            }
        }
        return false;
    }
}
