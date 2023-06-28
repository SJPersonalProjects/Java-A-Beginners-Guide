package java_a_beginners_guide.chapter_thirteen;

/**
 * A generic containment interface.
 * This interface implies that an implementing
 * class contains one or more values.
 * @param <T>: placeholder for an type used.
 */
public interface Containment<T extends Number> {
    /**
     * The contains() method tests if a specific item
     * is contained within an object that implements Containment.
     */
    boolean contains(T object);
}
