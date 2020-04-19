package com.company;

public interface Stack<E> {

    public void push(E item);

    public E pop();

    public int size();

    public boolean contains(E item);

    public E access(E item);
}
