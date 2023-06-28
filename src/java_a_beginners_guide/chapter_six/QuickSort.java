package java_a_beginners_guide.chapter_six;

public class QuickSort {

    static void quickSort(char[] elements) {
        quickSortAlgorithm(elements, 0, elements.length-1);
    }

    private static void quickSortAlgorithm(char[] elements, int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = elements[(left + right) / 2];

        do {
            while(elements[i] < x && (i < right)) i++;
            while(x < elements[j] && (j > left)) j--;

            if(i <= j) {
                y = elements[i];
                elements[i] = elements[j];
                elements[j] = y;
                i++; j--;
            }
        } while(i <= j);

        if(left < j) quickSortAlgorithm(elements, left, j);
        if(i < right) quickSortAlgorithm(elements, i, right);
    }
}
