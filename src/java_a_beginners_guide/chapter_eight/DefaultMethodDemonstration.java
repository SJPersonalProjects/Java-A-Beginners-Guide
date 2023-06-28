package java_a_beginners_guide.chapter_eight;

public class DefaultMethodDemonstration {
    public static void main(String[] args) {
        //MyIFImplementation object.
        MyIFImplementation object = new MyIFImplementation();

        //Can call get user ID because it is explicitly implemented by the class.
        System.out.println("User ID is: " + object.getUserID());
        //Can also call get admin ID because of default implementation.
        System.out.println("Adminstrator ID is: " + object.getAdminID());
    }
}
