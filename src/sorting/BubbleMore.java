package sorting;

public class BubbleMore {
    public static void main(String[] args) {
        int[] neemo = {5, 4, 3, 2, 1};
        BubbleMore anjana = new BubbleMore();
        anjana.next(neemo);
        for (int i = 0; i < neemo.length; i++) {
            System.out.println(neemo[i]);

        }
    }

    public void next(int[] glass) {
        for (int i = 0; i < glass.length; i++) {
            for (int j = 0; j < glass.length - 1; j++) {
                if (glass[j] > glass[j + 1]) {
                    int temp = glass[j];
                    glass[j] = glass[j + 1];
                    glass[j + 1] = temp;
                }
            }

        }
    }
}







