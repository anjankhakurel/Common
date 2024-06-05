package stackanjana;

public class CustomStack {

    int[] stack;//Declare gareko

    int ptr = -1;

    public static final int INITIAL_SIZE = 20;

    public CustomStack() { //Deafult Constructor
        this(INITIAL_SIZE);
    }

    public CustomStack(int size) { //Paramaterized Constructor
        this.stack = new int[size];

    }

    public boolean isfull() {
//        if(stack.length-1 == ptr){
//            return true;
//        }else{
//            return false;
//        }
        return this.stack.length - 1 == ptr;
    }

    public boolean isEmpty() {
//        if(ptr == -1){
//            return true;
//        }else {
//            return false;
//        }
        return ptr == -1;
    }

    public boolean push(int data) {
        if (isfull()) {
            System.out.println("My stack is already full");
            return false;
        } else {
            ptr++;
            stack[ptr] = data;
            return true;

        }

    }

    public boolean pop() {
        if (isEmpty()) {
            System.out.println("My Stack is Empty");
            return false;
        } else {
            ptr--;
            return true;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty");
            return -1;
        }
        return this.stack[ptr];
    }
}







