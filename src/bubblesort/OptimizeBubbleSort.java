package bubblesort;

public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int[] everest = {5,4,3,2,1};
        OptimizeBubbleSort anjana = new OptimizeBubbleSort();
        anjana.mount(everest);
        for (int i = 0; i < everest.length; i++) {
            System.out.println(everest[i]);

        }
    }

    public void mount(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false) {
                System.out.println("noswappingoccured");
                break;
           }
        }
    }
}
