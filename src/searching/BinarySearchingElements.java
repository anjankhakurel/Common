package searching;

public class BinarySearchingElements {
    public static void main(String[] args) {
        int[] array = {3,6,8,10,14,17,20,25,76};
        int target = 3;
        BinarySearchingElements se = new BinarySearchingElements();
        boolean result = se.BinarySearchingElements(array, target);
        System.out.println(result);

        int index = se.BinarySearchingElementsIndex(array, target);
        System.out.println(index);
    }

    public boolean BinarySearchingElements(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public int BinarySearchingElementsIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}



