package java_a_beginners_guide.chapter_six;

public class AccessDemonstration {
    public static void main(String[] args) {
        MyClass accessModifiers = new MyClass();

        //Access to alpha member is only allowed through its public methods.
        accessModifiers.setAlpha(-99);
        System.out.println("accessModifiers.getAlpha() : " + accessModifiers.getAlpha());

        //This approach is fine since they are defined as public.
        accessModifiers.beta = 10;
        accessModifiers.gama = 12;
    }
}
