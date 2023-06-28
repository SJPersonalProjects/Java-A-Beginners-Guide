package java_a_beginners_guide.chapter_six;

public class OuterClass {
    //Instance field.
    int[] numbers;

    /**
     * Constructor to initialize the object with an array.
     * @param numbers: 1d array of type integer.
     */
    public OuterClass(int[] numbers) {
        this.numbers = numbers;
    }

    public void analyze() {
        //Inner class object.
        InnerClass innerClass = new InnerClass();

        //Operating on the array
        System.out.println("Minimum value: " + innerClass.minimumValue());
        System.out.println("Maximum value: " + innerClass.maximumValue());
        System.out.println("Average value: " + innerClass.averageValue());
    }

    /**
     * Inner class for several operations for outer class.
     * Like finding minimum, maximum and average values from an array.
     * And also to increase readability of this program.
     */
    class InnerClass {
        //Operations.

        /**
         * Finds the minimum value from the array.
         * @return the minimum value.
         */
        public int minimumValue() {
            int minimumValue = numbers[0];

            //For loop to iterate over array of numbers.
            for(int i = 1; i < numbers.length; i++) {
                //Checks if the values are smaller than the given ones.
                //Save it in the minimumValue variable.
                if(numbers[i] < minimumValue) minimumValue = numbers[i];
            }

            return minimumValue; //Returns the minimum value found.
        }

        /**
         * finds the greatest value in the given array.
         * @return greatest value in the array.
         */
        public int maximumValue() {
            int maximumValue = numbers[0];

            //For loop to iterate through array to find the maximum value.
            for(int i = 1; i < numbers.length; i++) {
                //Checks if the values are greater than the minimumValue
                //Then, initialize that value to maximumValue.
                if(numbers[i] > maximumValue) maximumValue = numbers[i];
            }

            return maximumValue; //Returns the greatest of all the values in the array.
        }

        /**
         * Finds the average value from the given array.
         * @return the average value.
         */
        public int averageValue() {
            int averageValue = 0;

            //For loop to iterate through the array to find the average value.
            for(int i = 0; i < numbers.length; i++) {
                //Keeps adding the values from the whole array 1 by 1.
                averageValue = averageValue + numbers[i];
            }

            //Divides the whole value by the number of elements in the array before it returns the value.
            return (averageValue / numbers.length);
        }
    }
}
