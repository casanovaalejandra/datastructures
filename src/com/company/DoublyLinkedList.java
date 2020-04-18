package com.company;

import java.util.Iterator;
import java.util.function.Consumer;

public class DoublyLinkedList<T> implements Iterable<T>{
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail =  null;

    public class Node<T>{

    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }
}
