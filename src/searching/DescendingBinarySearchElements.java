package searching;

public class DescendingBinarySearchElements {
    public static void main(String[] args) {

        int[] array = {76, 25, 20, 17, 14, 10, 8, 6, 3, 433, 22, -32, -1, -2, -56, -2334, -88, 1,};
        int target = 123;
        DescendingBinarySearchElements bs = new DescendingBinarySearchElements();

        boolean result = bs.searchingTargetelements(array, target);
        System.out.println(result);

        int index = bs.searchingTargetelementsindex(array, target);
        System.out.println(index);

    }

    public boolean searchingTargetelements(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;

    }

    public int searchingTargetelementsindex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;

    }

}
