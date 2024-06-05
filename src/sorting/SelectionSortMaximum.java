package sorting;

import java.util.Arrays;

public class SelectionSortMaximum {
    public static void main(String[] args) {
        int[] nums = {-21,-233,-11,-1,56,345,123,5, 4, 3, 2, 1};

        for (int i=0; i< nums.length; i++){

            System.out.print(nums[i] + " ");
        }
        //System.out.println(Arrays.toString(nums));
        SelectionSortMaximum ss = new SelectionSortMaximum();
        ss.selectionSort(nums);
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
