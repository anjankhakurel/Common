package revision;

public class BubbleSortMore {
    public static void main(String[] args) {
        //int arr[] = {5,3,8,7,2};
        int arr [] = {1,2,3,4,5};
        BubbleSortMore bsm = new BubbleSortMore();
        bsm.bubblegum(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void bubblegum (int [] array){
        for (int i=0; i<array.length; i++){
            boolean swapped = false;
            for (int j=0; j<array.length-1; j++){
                if (array [j] > array [j+1]){
                    int temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                    swapped = true;

                }
            }
            //System.out.println(swapped);
            if (swapped == false) break;
        }
    }
}
