package Pulkit06417711923;
import java.util.Scanner;
class Stack {
    private int[] arr;
    private int top;
    private int stackSize;
    public Stack(int size) {
        this.stackSize = size;
        arr = new int[stackSize];
        setTop(-1);
    }
    public int getTop() {
        return top;
    }
    public void setTop(int flag) {
        if (flag == 1) {
            top++;
        } else if (flag == -1) {
            top--;
        }
    }
    public void push(int value) {
        if (getTop() == stackSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            arr[getTop() + 1] = value;
            setTop(1);
            System.out.println("Pushed: " + value);
        }
    }

    public void pop() {
        if (getTop() == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println("Popped: " + arr[getTop()]);
            setTop(-1);
        }
    }
    public void displayStack() {
        if (getTop() == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= getTop(); i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter element to push: ");
            int value = sc.nextInt();
            stack.push(value);
        }
        stack.displayStack();
        for (int i = 1; i <= 5; i++) {
            stack.pop();
        }
        stack.displayStack();
    }
}
