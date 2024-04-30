package searching;

public class BinarySearch1 {
    public static void main(String[] args) {
        int [] arr = {-131,-17,-12,0,3,6,8,10,14,17,20,25,76,80,89,90,99,101,104};
        int target = 199;
        BinarySearch1 bs = new BinarySearch1();
        boolean result =  bs.searchTarget( arr, target );
        System.out.println(result);
    }
    public boolean searchTarget (int[] arr, int target){
        int start = 0;
        int  end = arr.length-1;

        while (start <= end){
            int middle = (start+end)/2;
            if (target < arr[middle]) {
                end = middle-1;
            } else if (target > arr[middle]) {
                start = middle+1;
            }else{
                return true;

            }
        }
        return false;
    }
}
