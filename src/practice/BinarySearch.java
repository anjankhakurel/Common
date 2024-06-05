package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8, 10, 12, 14, 16};
        int[] array1 = {16,14,12,10,8,6,4,2,0};
        int target = 169;
        BinarySearch bs = new BinarySearch();
        boolean result = bs.searchTargetDsc(array, target);
        //System.out.println(result);
       // int i = 2147483648;

        System.out.println(bs.isAscending(array));

    }

    public boolean isAscending (int[] array){
        if (array[0] > array[1] ){
           return false;
        }
        return true;
    }

    public boolean searchTargetAsc(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target == array[middle]) {
                return true;
            } else if (target < array[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;

            }
        }
        return false;
    }


    public boolean searchTargetDsc (int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
             int middle = (start + end) / 2;
            if (target == array[middle]) {
                return true;
            } else if (target < array[middle]) {
                start = middle + 1;
            }else{
                end  = middle - 1;

            }
        }
        return false;
    }


}