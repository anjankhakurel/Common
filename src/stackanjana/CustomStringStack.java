package stackanjana;

public class CustomStringStack {

    private String [] stack;
    private int ptr = -1;

    private final static int INITIAL_SIZE = 3;

    public CustomStringStack() {
        this(INITIAL_SIZE);
    }

    public CustomStringStack(int size) {
        this.stack = new String [size];
    }

    public boolean isEmpty() {

        return ptr == -1;
    }

    public boolean isFull() {

        return this.stack.length - 1 == ptr;
    }

    public void add(String data) {
        if (isFull()) {
            System.out.println("My Stack is full");
        } else {
            ptr++;
            this.stack[ptr] = data;
        }
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("My Stack is Empty");
             return  "-1";
        } else {
            //ptr--;
            return this.stack[ptr--];
        }
    }

    public String topElement() {
        if (isEmpty()) {
            System.out.println("My Stack is Empty");
            return "-1";
        } else {
            return this.stack[ptr];
        }
    }
}
