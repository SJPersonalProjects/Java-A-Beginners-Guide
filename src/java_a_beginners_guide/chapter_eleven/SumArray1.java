package java_a_beginners_guide.chapter_eleven;

public class SumArray1 {
    //Instance field.
    private int sum;

    /**
     * Method to return the sum of an integer array.
     * @param numbers: integer array.
     * @return sum of the elements of an integer array.
     */
    public int sumArray(int[] numbers) {
        sum = 0; //Reset the sum.

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try{
                Thread.sleep(10); //Allow task-switch.
            }catch(InterruptedException exception) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }
}
