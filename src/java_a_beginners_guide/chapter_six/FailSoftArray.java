package java_a_beginners_guide.chapter_six;

public class FailSoftArray {
    //Instance fields.
    private int[] arrayElements;
    private int errorValue;
    public int length;

    public FailSoftArray(int size, int errorValue){
        this.arrayElements = new int[size];
        this.length = size;
        this.errorValue = errorValue;
    }

    //Return a value at a given index.
    public int get(int index) {
        if(indexOK(index)) {
            return arrayElements[index];
        }

        return errorValue;
    }

    //Put a value at an given index, return false on failure.
    public boolean put(int index, int element) {
        if(indexOK(index)) {
            this.arrayElements[index] = element;
            return true;
        }

        return false;
    }

    //Return true if index is within bounds.
    private boolean indexOK(int index) {
        if(index >= 0 && index < length) {
            return true;
        }

        return false;
    }
}
