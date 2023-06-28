package java_a_beginners_guide.chapter_thirteen;

public class GenericIfDemonstration {
    public static void main(String[] args) {
        Integer[] valuesInteger = {1, 2, 3, 4, 5};

        MyClass<Integer> object = new MyClass<>(valuesInteger);

        if(object.contains(2))
            System.out.println("2 is in the object");
        else
            System.out.println("2 is not in object");

        if(object.contains(5))
            System.out.println("5 is in the object");
        else
            System.out.println("5 is not in object");

        //The following is illegal because object
        //is an Integer containment and 9.25 is a Double value.
//        if(object.contains(9.25))
//            System.out.println("9.25 is in the object");
//        else
//            System.out.println("9.25 is not in object");
    }
}
