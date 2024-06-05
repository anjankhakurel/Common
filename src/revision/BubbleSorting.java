package revision;

public class BubbleSorting {
    public static void main(String[] args) {
        int [] array = {6,5,4,3,2,1};
        BubbleSorting bs = new BubbleSorting();
        bs.bubblesort(array);
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }


    public void bubblesort (int[] arr){
        for (int i =0; i< arr.length; i++){
            for (int j =0; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr [j+1] = temp;
                }
            }
        }
    }
}
