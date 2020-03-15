package com.company;

import java.util.Iterator;

public class dinamicArray<T> implements DAinterface<T>, Iterable<T>{
    public T[] array;
    public int capacity; //actual size of array
    public int size; //size the user defines the array

    public dinamicArray(int cap){
      if( cap<0) throw new IllegalArgumentException("Illegal capacity: "+cap);
      this.capacity = cap;
      array = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        return size() == 0;
    }

    @Override
    public T get(int index) {
        if(index<0 || index>=size ) throw new IndexOutOfBoundsException(" Index is out of bounds");

        return array[index];
    }

    @Override
    public void set(T elem, int index) {
        if(index<0 || index>size) throw new IndexOutOfBoundsException("Index out of bounds");
        else array[index]=elem;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            array[i]=null;
        }

    }

    @Override
    public void add(T elem) {
        /*In this method we are going to resize the array. First we verify if by adding one we reached the
        * maximum capacity. If yes then we double the capacity, create a new array of the new capacity and
        * add all the elements on the array to our new array.
        * If we have not reached the end then we just add the element to the current array*/

        if(size + 1>= capacity) {
            capacity = capacity * 2;
            T[] arr = (T[]) new Object[capacity];
            for(int i = 0; i <size; i++) arr[i]=array[i];
            array = arr;
        }
        array[size++]=elem;
    }

    @Override
    public void removeAt(int index) {
        /*In this method we will remove the element if found on the array and maintain the array on the same order
        *as it was before*/
        if(index <0 || index >=size) throw new IndexOutOfBoundsException("Index out of bounds");
        T elem = array[index];
        T[] new_arr = (T[]) new Object[capacity-1];
        for(int i = 0; i<size; i++){
            if(array[i] == elem) continue;
            else new_arr[i]= array[i];
        }
        array=new_arr;
        capacity=capacity-1;
    }

    @Override
    public boolean remove(T elem) {
        /*In this method we are going to remove the element if it is found on
        *the array*/
        int index = indexOf(elem);
        if(index == -1) return false;
        removeAt(index);
        return true;
    }

    @Override
    public int indexOf(T elem) {
        int result = -1;
        for(int i= 0; i<size; i++){
            if(array[i]==elem)result= i;
        }
        return result;
    }

    @Override
    public boolean contains(Object elem) {
        /*
        This method verify if an element is part of the array
        this can also be: return indexOf(elem) != -1; which is much better...
         */
        if(size == 0) return false;
        else if( size == 1 && array[0]!= elem) return false;
        for(int i =0; i<size; i++){
            if(array[i]== elem) return true;
            continue;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new java.util.Iterator<T>(){
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                return array[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("not yet implemented...");
            }
        };
    }
    public String toString(){
        if(size == 0) return "[]";
        StringBuilder str = new StringBuilder(size).append("[");
        for(int i =0; i<size; i++){
            str.append(array[i] + ", ");
        }
        str.append("]");
     return str.toString();
    }
}
