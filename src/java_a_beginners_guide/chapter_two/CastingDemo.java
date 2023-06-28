package java_a_beginners_guide.chapter_two;

public class CastingDemo {
    public static void main(String[] args) {
        double valueX, valueY;
        byte valueByte;
        int valueInteger;
        char valueCharacter;

        valueX = 10.0;
        valueY = 3.0;

        valueInteger = (int) (valueX / valueY); //cast double to int.
        System.out.println("Integer outcome of valueX / valueY : " + valueInteger);

        valueInteger = 100;
        valueByte = (byte) valueInteger; //cast integer to byte without any loss of data.
        System.out.println("Value of valueByte : " + valueByte);

        valueInteger = 257;
        valueByte = (byte) valueInteger; //cast integer to byte with loss of data.
        System.out.println("Value of valueByte : " + valueByte);

        valueByte = 88; //ASCII code for X
        valueCharacter = (char) valueByte; //cast byte to character.
        System.out.println("valueCharacter : " + valueCharacter);
    }
}
