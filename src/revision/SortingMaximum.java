package revision;

import java.util.Arrays;

public class SortingMaximum {

    public static void main(String[] args) {
        int[] nums = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(nums));
        SortingMaximum sm = new SortingMaximum();
        sm.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lastIndex = array.length - 1 - i;
            int maxIndex = findMax(array, lastIndex);
            swapped(array, lastIndex, maxIndex);

        }
    }

    private void swapped(int[] array, int lastIndex, int maxIndex) {
        int temp = array[maxIndex];
        array[maxIndex] = array[lastIndex];
        array[lastIndex] = temp;


    }

    private int findMax(int[] array, int lastIndex) {
        int max = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if (array[i] > array[max]) {
                max = i;

            }
        }
        return max;
    }
}
