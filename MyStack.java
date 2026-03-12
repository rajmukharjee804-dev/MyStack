public class MyStack {

    int[] stack = new int[5];
    int top = -1;

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    public int peek() {
        if (top == -1) {
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}