package java_a_beginners_guide.chapter_twelve;

//Use static import to bring sqrt() and pow() into view.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Quadratic2 {
    public static void main(String[] args) {
        //a, b, and c represents the coefficient in the
        //quadratic equation: ax² + bx + c = 0;
        double a, b, c, x;

        //Solve 4x² + x - 3 = 0 for x.
        a = 4;
        b = 1;
        c = -3;

        //Find first solution.
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        //First second solution.
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
