package stackanjana;

public class StackRevisionString {

    private String [] stack;
    private int ptr = -1;

    private static final int INITIAL_SIZE = 4;

    public StackRevisionString() { //object create
        this(INITIAL_SIZE);
    }

//    int [] arr = new int[5];
//    double [] array = new double[5];
   //  String [] array1 = new String[5];

    public StackRevisionString(int size) { //object create
        this.stack = new String [size];
    }

    public boolean isFull() {

        return this.stack.length - 1 == ptr;
    }

    public boolean isEmpty() {

        return ptr == -1;
    }

    public void add(String data) {
        if (isFull()) {
            System.out.println("mero stack full cha");
        } else {
            ptr++;
            this.stack[ptr] = data;
        }
    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("mero stack empty cha");
            return "-1";
        } else {
//            ptr--;
            return this.stack[ptr--];
        }
    }

    public String topElement() {
        if (isEmpty()) {
            System.out.println("mero stack empty cha");
            return "-1";
        } else {
            return this.stack[ptr];
        }
    }

}
