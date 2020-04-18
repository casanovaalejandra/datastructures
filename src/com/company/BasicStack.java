package com.company;

public class BasicStack<E> implements Stack<E> {
    private E[] data;                                 //array that would hold our structure
    private int stackPointer;                          //internal pinter on out DS to know were to add the new item to the stack

    public BasicStack() {
        data = (E[]) new Object[1000];                // We have initialized the array of size 1000
        stackPointer = 0;
    }

    public void push(E item) {
        data[stackPointer++] = item;
    }

    public E pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("The stack does not contain items");
        }
        return data[--stackPointer];
    }

    public boolean contains(E item) {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i] == item) {
                found = true;
                break;
            }
        }
        return found;
    }

    public E access(E item) {
        while (stackPointer > 0) {
            E curr = pop();
            if (curr.equals(item)) return curr;
        }
        throw new IllegalArgumentException("Item not found");
    }

    public int size() {
        return stackPointer;
    }
}