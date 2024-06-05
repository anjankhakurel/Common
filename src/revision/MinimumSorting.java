package revision;

import java.util.Arrays;

public class MinimumSorting {
    public static void main(String[] args) {
        int[] nums = {-56,-23445, 64,234534,5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nums));
        MinimumSorting ms = new MinimumSorting();
        ms.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMin(array, i);
            swap(array, minIndex, i);
        }
    }

    private void swap(int[] array, int firstIndex, int minIndex) {
        int temp = array[minIndex];
        array[minIndex] = array[firstIndex];
        array[firstIndex] = temp;
    }

    private int findMin(int[] array, int firstIndex) {
        int min = firstIndex;
        for (int i = firstIndex + 1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
}
