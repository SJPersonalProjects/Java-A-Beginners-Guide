package java_a_beginners_guide.chapter_eleven;

public class SumArray {
    //Instance fields.
    private int sum;

    /**
     * Method to calculate the sum of elements of integer array.
     * Using synchronize to control the access.
     * @param numbers: integer array.
     * @return the total sum of elements in the array.
     */
    public synchronized int sumArray(int[] numbers) {
        sum = 0; //Reset the sum.

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try{
                Thread.sleep(10); //Allows task switch.
            }catch(InterruptedException exception) {
                System.out.println("Thread interrupted.");
            }
        }

        return sum;
    }


}
