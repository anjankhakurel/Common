package searching;

public class SearchingElements {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 1, 7, 960, 33, 11, 50, 7, 5};
        SearchingElements se = new SearchingElements();
        int target = 960;
        boolean result = se.findElement(array, target);
        System.out.println(result);

        int index = se.findElementIndex(array, target);
        System.out.println(index);

    }

    public boolean findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;

            }
        }
        return false;
    }

    public int findElementIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;

            }

        }
        return -1;

    }

}

