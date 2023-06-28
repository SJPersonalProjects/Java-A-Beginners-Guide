package java_a_beginners_guide.chapter_five;

public class CommandLineArgumentsDemo {
    public static void main(String[] args) {

        if(args.length < 4) {
            System.out.println("There are " + args.length + " command-line arguments.");
        }

        System.out.print("They are : ");
        //using for-each style for loop to fetch the data from command-line arguments.
        for(String data : args) {
            System.out.print(data + " ");
        }
    }
}
