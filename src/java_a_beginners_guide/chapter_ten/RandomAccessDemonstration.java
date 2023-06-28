package java_a_beginners_guide.chapter_ten;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemonstration {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        //Open and use a random access file.
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("random.data", "rw")) {
            //Write values to the file.
            for(int i = 0; i < data.length; i++) {
                randomAccessFile.writeDouble(data[i]);
            }

            //Now read back specific values.
            randomAccessFile.seek(0); //Seek the first double.
            d = randomAccessFile.readDouble();
            System.out.println("First value is : " + d);

            randomAccessFile.seek(8); //Seek the second double.
            d = randomAccessFile.readDouble();
            System.out.println("Second value is : " + d);

            randomAccessFile.seek(8 * 3); //Seek the fourth double.
            d = randomAccessFile.readDouble();
            System.out.println("Fourth value is : " + d);

            System.out.println(); //For a gap of line.

            //Now read every other value.
            System.out.print("Here is every other value: ");
            for(int i = 0; i < data.length; i += 2) {
                randomAccessFile.seek(8 * i);
                d = randomAccessFile.readDouble();
                System.out.print(d + " ");
            }
        }catch(IOException ioException) {
            System.out.println("I/O Error: " + ioException);
        }
    }
}
