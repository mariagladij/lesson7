package ua.hillel.qaauto;

public class Stack {
    int stackArray[] = new int[10];
    int topOfStack;

    Stack() {
        topOfStack = -1;
    }

    void push(int item) {
        if(topOfStack == 9) System.out.println("stack is full");
        else
            stackArray[++topOfStack] = item;
    }

    int pop() {
        if (topOfStack <0) return 0;
        return  stackArray[topOfStack--];

    }
}
