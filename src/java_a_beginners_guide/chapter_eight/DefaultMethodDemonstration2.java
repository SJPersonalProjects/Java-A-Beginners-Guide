package java_a_beginners_guide.chapter_eight;

public class DefaultMethodDemonstration2 {
    public static void main(String[] args) {
        //MyIFImplementation2 object.
        MyIFImplementation2 object = new MyIFImplementation2();

        System.out.println("User ID is: " + object.getUserID());
        System.out.println("Administrator ID is: " + object.getAdminID());
    }
}
