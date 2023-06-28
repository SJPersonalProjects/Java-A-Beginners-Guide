package java_a_beginners_guide.chapter_ten;

import java.io.PrintWriter;

public class PrintWriterDemonstration {
    public static void main(String[] args) {
        //Creating PrintWriter object.
        PrintWriter printWriter = new PrintWriter(System.out, true);

        int i = 10;
        double d = 123.65;

        printWriter.println("Using a printWriter.");
        printWriter.println(i);
        printWriter.println(d);

        printWriter.println(i + " + " + d + " + " + " is " + (i + d));
    }
}
