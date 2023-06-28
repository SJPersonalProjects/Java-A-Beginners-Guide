package java_a_beginners_guide.chapter_five;

public class ReferenceLocalVariableInferenceDemonstration {
    public static void main(String[] args) {
        var typeInferenceExample = new LocalVariableTypeInferenceReference(10);

        System.out.println("Peron age is : " + typeInferenceExample.getPersonAge());
        typeInferenceExample.setPersonAge(19);
        System.out.println("Now, Person age is : " + typeInferenceExample.getPersonAge());
    }
}
