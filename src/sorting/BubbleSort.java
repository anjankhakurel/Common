package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        //int arr[] = {9, 8, 7, 6, 5, 4, 3};
        int arr[] = {1,2,3,4,5};
        BubbleSort anant = new BubbleSort();
        anant.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        }
       // System.out.println(false==false);
    }

    public void bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped=true;
                }
            }
            //System.out.println(swapped);
            if (swapped==false) break;
        }
    }
}
