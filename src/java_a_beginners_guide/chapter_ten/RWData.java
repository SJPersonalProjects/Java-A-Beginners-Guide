package java_a_beginners_guide.chapter_ten;

import java.io.*;

public class RWData {
    public static void main(String[] args) {

        int i = 10;
        double d = 1023.56;
        boolean b = true;

        //Write some values.
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("testdata"))) {

            System.out.println("Writing " + i);
            dataOutputStream.writeInt(i);

            System.out.println("Writing " + d);
            dataOutputStream.writeDouble(d);

            System.out.println("Writing " + b);
            dataOutputStream.writeBoolean(b);

            System.out.println("Writing " + (12.2 * 7.4));
            dataOutputStream.writeDouble(12.2 * 7.4);
        }catch (IOException ioException) {
            System.out.println("Write error");
            return;
        }

        System.out.println("\n");

        //Now, read them back.
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("testdata"))) {

            i = dataInputStream.readInt();
            System.out.println("Reading " + i);

            d = dataInputStream.readDouble();
            System.out.println("Reading " + d);

            b = dataInputStream.readBoolean();
            System.out.println("Reading " + b);

            d = dataInputStream.readDouble();
            System.out.println("Reading " + d);

        }catch(IOException ioException) {
            System.out.println("Read error");
        }


    }
}
