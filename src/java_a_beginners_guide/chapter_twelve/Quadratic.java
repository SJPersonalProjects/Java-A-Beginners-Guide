package java_a_beginners_guide.chapter_twelve;

public class Quadratic {
    public static void main(String[] args) {
        //a, b, and c represents the coefficient in the
        //quadratic equation: ax² + bx + c = 0;
        double a, b, c, x;

        //Solve 4x² + x - 3 = 0 for x.
        a = 4;
        b = 1;
        c = -3;

        //Find first solution.
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        //First second solution.
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
