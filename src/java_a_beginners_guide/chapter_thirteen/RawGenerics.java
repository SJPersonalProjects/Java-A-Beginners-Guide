package java_a_beginners_guide.chapter_thirteen;

public class RawGenerics<T> {
    T object; //Declare an object of type T.

    //Pass the constructor a reference to an object of type T.
    RawGenerics(T object) {
        this.object = object;
    }

    //Return the object.
    public T getObject() {
        return object;
    }
}
