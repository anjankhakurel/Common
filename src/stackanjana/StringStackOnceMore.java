package stackanjana;

public class StringStackOnceMore {

    private String[] nums;
    private int ptr = -1;

    private static final int INITIAL_SIZE = 5;

    public StringStackOnceMore() {//default
        this(INITIAL_SIZE);
    }

    public StringStackOnceMore(int size) {//parameterized
        this.nums = new String[size];//size declare gareko
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return this.nums.length - 1 == ptr;
    }

    public void insert(String data) {
        if (isFull()) {
            System.out.println("It is full");
        } else {
            ptr++;
            this.nums[ptr] = data;
        }
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("It is empty");
            return "-1";
        } else {
            return this.nums[ptr--];
        }
    }

    public String topElement() {
        if (isEmpty()) {
            System.out.println("It is empty");
            return  "-1";
        } else {
            return this.nums[ptr];
        }
    }
}
