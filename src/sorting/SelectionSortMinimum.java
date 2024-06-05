package sorting;

import java.util.Arrays;

public class SelectionSortMinimum {
    public static void main(String[] args) {
        int[] nums = {23,-122,399,55,-57,-998,65};
        System.out.println(Arrays.toString(nums));

        SelectionSortMinimum ss = new SelectionSortMinimum();
        ss.selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMin(array, i);
            swapped(array, i, minIndex);
        }
    }

    private void swapped(int[] array, int firstIndex, int minIndex) {
        int temp = array[minIndex];
        array[minIndex] = array[firstIndex];
        array[firstIndex] = temp;
    }

    private int findMin(int[] array, int firstIndex) {
        int min = firstIndex;
        for (int index = firstIndex + 1; index < array.length; index++) {
            if (array[index] < array[min]) {
                min = index;
            }
        }
        return min;
    }
}
