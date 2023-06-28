package java_a_beginners_guide.chapter_six;

public class ConstructorOverloadingDemonstration {
    public static void main(String[] args) {
        //Objects of ConstructorOverloading class.
        ConstructorOverloading constructorOverloading1 = new ConstructorOverloading();
        ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(50);
        ConstructorOverloading constructorOverloading3 = new ConstructorOverloading(100.0);
        ConstructorOverloading constructorOverloading4 = new ConstructorOverloading(10, 40);

        //Displaying the valueX of each object separately.
        System.out.println("constructorOverloading1.valueX : " + constructorOverloading1.valueX);
        System.out.println("constructorOverloading2.valueX : " + constructorOverloading2.valueX);
        System.out.println("constructorOverloading3.valueX : " + constructorOverloading3.valueX);
        System.out.println("constructorOverloading4.valueX : " + constructorOverloading4.valueX);
    }
}
