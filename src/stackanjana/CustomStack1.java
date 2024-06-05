package stackanjana;

public class CustomStack1 {

    private int[] stack;
    private int ptr = -1;

    private final static int INITIAL_SIZE = 3;

    public CustomStack1() {
        this(INITIAL_SIZE);
    }

    public CustomStack1(int size) {
        this.stack = new int[size];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return this.stack.length - 1 == ptr;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("My Stack is full");
        } else {
            ptr++;
            this.stack[ptr] = data;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("My Stack is Empty");
            return -1;
        } else {
            //ptr--;
            return this.stack[ptr--];
        }
    }

    public int topElement() {
        if (isEmpty()) {
            System.out.println("My Stack is Empty");
            return -1;
        } else {
            return this.stack[ptr];
        }
    }
}
