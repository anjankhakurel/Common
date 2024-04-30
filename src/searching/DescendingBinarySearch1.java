package searching;

public class DescendingBinarySearch1 {
    public static void main(String[] args) {
        int [] array = {104, 101, 99, 90, 89, 80, 76, 25, 20, 17, 14, 10, 8, 6, 3, 0, -12, -17, -131};
        int target = 1330;
        DescendingBinarySearch1 dbs1 = new DescendingBinarySearch1();
        boolean result = dbs1.searchDescendingTarget(array,target);
        System.out.println(result);

    }
    public boolean searchDescendingTarget (int[]array,int target){
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int middle = (start + end)/2;
            if (target > array[middle]) {
                end = middle - 1;
            }else if (target < array[middle]){
                start = middle + 1;
            }else{
                return true;
            }

        }
        return false;
    }
}
