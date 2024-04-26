package bubblesort;

public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int[] Everest = {9, 5, 1, 3, 6};
        OptimizeBubbleSort anjana = new OptimizeBubbleSort();
        anjana.mount(Everest);
        for (int i = 0; i < Everest.length; i++) {
            System.out.println(Everest[i]);

        }
    }

    public void mount(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;


                }

            }
        }
    }
}
