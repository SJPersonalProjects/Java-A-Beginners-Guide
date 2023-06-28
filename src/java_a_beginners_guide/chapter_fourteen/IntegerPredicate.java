package java_a_beginners_guide.chapter_fourteen;

/**
 * A functional interface for numeric predicates that operate on integer values.
 */
@FunctionalInterface
public interface IntegerPredicate {
    boolean test(int number);
}
