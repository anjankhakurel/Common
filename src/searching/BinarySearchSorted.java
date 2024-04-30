package searching;

public class BinarySearchSorted {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 9, 11, 13, 16, 18, 22, 25, 27, 30, 34};
        int target = 11;
        BinarySearchSorted bs = new BinarySearchSorted();
        boolean result = bs.findsortedarray(array, target);
        System.out.println(result);

        int index = bs.findsortedarrayindex(array, target);
        System.out.println(index);
    }

    public boolean findsortedarray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;

            }
        }
        return false;
    }

    public int findsortedarrayindex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }

        return -1;
    }

}
