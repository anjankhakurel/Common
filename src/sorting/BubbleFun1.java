package sorting;

public class BubbleFun1 {
    public static void main(String[] args) {
        //int[] array = {45, -2233, 745858, -47363, -1, 0, 34738378};
        int [] array = {3,5666,3232,67,0,12,54};
            BubbleFun1 anant = new BubbleFun1();
        anant.cake(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void cake(int[] dog) {
        for (int i = 0; i < dog.length; i++) {
            for (int j = 0; j < dog.length - 1; j++) {
                if (dog[j] > dog[j + 1]) {
                    int temp = dog[j];
                    dog[j] = dog[j + 1];
                    dog[j + 1] = temp;

                }

            }
        }
    }
}
