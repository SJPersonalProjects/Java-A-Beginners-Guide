package java_a_beginners_guide.chapter_ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AverageNumbers {
    public static void main(String[] args) throws IOException {
        //Creating a BufferedReader using System.in.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text;
        int n;
        double sum = 0.0;
        double average, t;

        System.out.print("How many numbers will you enter: ");
        text = bufferedReader.readLine();

        try{
            n = Integer.parseInt(text); //Converts String to int.
        }catch (NumberFormatException exception) {
            System.out.println("Invalid format");
            n = 0;
        }

        System.out.println("Enter " + n + " values");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            text = bufferedReader.readLine();
            try {
                t = Double.parseDouble(text);
            }catch(NumberFormatException exception) {
                System.out.println("Invalid format");
                t = 0.0;
            }
            sum += t;
        }

        average = sum / n;
        System.out.println("Average is : " + average);
    }
}
