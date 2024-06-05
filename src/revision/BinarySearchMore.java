package revision;

public class BinarySearchMore {
    public static void main(String[] args) {
        int [] array = {16, 14, 12, 10, 8, 6, 4, 2, 0};
        int target = 1;
        BinarySearchMore bsm = new BinarySearchMore();
        boolean result = bsm.searchTargetDsc(array, target);
        System.out.println(result);
    }

    public boolean searchTargetAsc(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == array[middle]) {
                return true;
            } else if (target < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return false;
    }

    public boolean searchTargetDsc(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == array[middle]) {
                return true;
            } else if (target < array[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
