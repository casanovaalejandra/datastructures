package com.company;

import java.util.Iterator;

public interface DAinterface<T> {
    public int size();
    public boolean isEmpty();
    public T get(int index);
    public void set(T elem, int index);
    public void clear();
    public void add(T elem);
    public void removeAt(int index);
    public boolean remove(T elem);
    public int indexOf(T elem);
    public boolean contains(T elem);
    public Iterator<T> iterator();
    public String toString();


}
