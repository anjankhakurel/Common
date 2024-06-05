package revision;

public class OptimiseVersion {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6};
        OptimiseVersion ov = new OptimiseVersion();
        ov.sortOptimize(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void sortOptimize(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
        }
    }
}
