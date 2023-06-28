package java_a_beginners_guide.chapter_six;

public class PassObject {
    public static void main(String[] args) {
        //Block class objects.
        Block objectOne = new Block(10, 2, 5);
        Block objectTwo = new Block(10, 2, 5);
        Block objectThree = new Block(4, 5, 5);

        System.out.println("ObjectOne same dimensions as ObjectTwo : " +
                objectOne.isSameBlock(objectTwo));
        System.out.println("ObjectOne same dimensions as ObjectThree : " +
                objectOne.isSameBlock(objectThree));
        System.out.println("ObjectOne same volume as ObjectThree : " +
                objectOne.isSameVolume(objectThree));

    }
}
