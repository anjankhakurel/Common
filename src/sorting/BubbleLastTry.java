package sorting;

public class BubbleLastTry {
    public static void main(String[] args) {
        int[] array = {45, 7655, -23, 8990, 0, -23, -1, 433, 23};
        BubbleLastTry luci = new BubbleLastTry();
        luci.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
        public void sort ( int[] nums){//method created
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j ++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;


                    }

                }

            }


        }
    }

