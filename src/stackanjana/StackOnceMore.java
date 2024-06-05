package stackanjana;

public class StackOnceMore {

    private int[] nums;
    private int ptr = -1;

    private static final int INITIAL_SIZE = 5;

    public StackOnceMore() {//default
        this(INITIAL_SIZE);
    }

    public StackOnceMore(int size) {//parameterized
        this.nums = new int[size];//size declare gareko
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return this.nums.length - 1 == ptr;
    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("It is full");
        } else {
            ptr++;
            this.nums[ptr] = data;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("It is empty");
            return -1;
        } else {
            return this.nums[ptr--];
        }
    }

    public int topElement(){
        if(isEmpty()){
            System.out.println("It is empty");
            return -1;
        }else{
            return this.nums[ptr];
        }
    }
}
