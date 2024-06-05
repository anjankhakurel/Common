package stackanjana;

public class StackRevision {

    private int[] stack;
    private int ptr = -1;

    private static final int INITIAL_SIZE = 4;

    public StackRevision() { //object create
        this(INITIAL_SIZE);
    }

    public StackRevision(int size) { //object create
        this.stack = new int[size];
    }

    public boolean isFull() {

        return this.stack.length - 1 == ptr;
    }

    public boolean isEmpty() {

        return ptr == -1;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("mero stack full cha");
        } else {
            ptr++;
            this.stack[ptr] = data;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("mero stack empty cha");
            return -1;
        } else {
//            ptr--;
            return this.stack[ptr--];
        }
    }

    public int topElement() {
        if (isEmpty()) {
            System.out.println("mero stack empty cha");
            return -1;
        } else {
            return this.stack[ptr];
        }
    }

}
