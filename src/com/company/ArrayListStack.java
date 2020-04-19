package com.company;

import java.util.ArrayList;

public class ArrayListStack<E> implements Stack<E> {
    private ArrayList<E> stack;
    private int size, pointer;

    public ArrayListStack(){
        stack = new ArrayList<>();
        size = 0;
        pointer = 0;
    }
    public E peek(){
        if(pointer==0) throw new IllegalArgumentException("Stack is empty");
        else return stack.get(pointer);
    }

    @Override
    public void push(E item) {
        stack.add(pointer++,item);
    }

    @Override
    public E pop() {
        if(pointer == 0) throw new IllegalArgumentException("stack is empty");
        else return stack.remove(pointer--);
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean contains(E item) {
        if(pointer==0)return false;

        boolean ans = false;

        for( int i = 0; i< pointer; i++){
            if(stack.get(i).equals(item)) ans = true;
        }
        return ans;
    }

    @Override
    public E access(E item) {
        while(pointer>0){
            E curr = pop();
            if(curr.equals(item)) return curr;

        }
        throw new IllegalArgumentException("Item is not on Stack");
    }
}
