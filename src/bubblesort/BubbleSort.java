package bubblesort;

public class BubbleSort {
    public static void main(String[] args) {

        //int arr [] = {7,4,8,1,4,5,3,4};
        int arr[] = {1,2,3,4,5};
        BubbleSort gum = new BubbleSort();
        gum.bubble(arr);
        for (int i=0; i< arr.length;i++){
           // System.out.println(arr[i]);
        }
        //System.out.println(false==false);
    }
    public void bubble (int [] sort){
        for (int i=0; i<sort.length; i++){
             boolean swapped = false;
            for (int j=0; j<sort.length-1-i; j++){
                if (sort[j] > sort[j+1]){
                    int temp = sort [j];
                    sort [j] = sort [j+1];
                    sort [j+1] = temp;
                    swapped = true;
                }
            }
            //  System.out.println(swapped);
            if(swapped==false) break;
        }
    }
}
