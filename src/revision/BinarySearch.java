package revision;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8, 10, 12, 14, 16,};
        int target = 100;
        BinarySearch bs = new BinarySearch();
        boolean result = bs.serachTarget(array, target);
        System.out.println(result);

    }


    public boolean serachTarget(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (target < array[middle]) {
                end = middle - 1;

            } else if (target > array[middle]) {
                start = middle + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

