public class MyStack {

    private int stackPointer;
    private int[] elements;

    public MyStack(int size) {
        elements = new int[size];
        stackPointer = -1;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return elements[stackPointer];
    }

    public void push(int n) {
        if (stackPointer == elements.length - 1) {
            throw new RuntimeException("Stack is full");
        }
        elements[++stackPointer] = n;
    }

    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        stackPointer--;
    }

    public boolean isEmpty() {
        return stackPointer == -1;
    }

    public int getSize() {
        return stackPointer + 1;
    }
}