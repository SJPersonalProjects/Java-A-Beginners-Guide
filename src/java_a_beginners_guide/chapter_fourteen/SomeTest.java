
package java_a_beginners_guide.chapter_fourteen;
public interface SomeTest<T> {

    /**
     * A generic functional interface with two parameters
     * that return a boolean result.
     * @param valueX: is a value of any valid type.
     * @param valueY: is another value of any value type.
     * @return returns a boolean result after some task.
     */
    boolean test(T valueX, T valueY);
}
