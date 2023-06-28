package java_a_beginners_guide.chapter_six;

public class FailSoftArrayDemonstration {
    public static void main(String[] args) {
        FailSoftArray failSoftArray = new FailSoftArray(5, -1);
        int x;

        //Show quiet failures.
        System.out.println("Fail Quietly.");
        for(int i = 0; i < failSoftArray.length * 2; i++) {
            failSoftArray.put(i, i * 10);
        }

        for(int i = 0; i < failSoftArray.length * 2; i++) {
            x = failSoftArray.get(i);
            if(x != -1) System.out.print(x + " ");
        }

        System.out.println("");

        //Now, handle failures.
        System.out.println("\nFail with error reports:");
        for(int i = 0; i < failSoftArray.length * 2; i++) {
            if(!failSoftArray.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");
        }

        for(int i = 0; i < failSoftArray.length * 2; i++) {
            x = failSoftArray.get(i);
            if(x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds.");
        }
    }
}
