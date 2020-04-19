package com.company;

public class BasicQueue<E> {
    private E[] data;
    private int start, end;
    public BasicQueue(){
        this(1000);
    }

    public BasicQueue(int size){
        data = (E[]) new Object[size];
        this.start = -1;
        this.end = -1;
    }

    public int size(){
        if(start == -1 && end == -1) return 0;
        return end-start+1;
    }

    public void enQueue(E item){
        if((end+1)%data.length == start) throw new IllegalArgumentException("The queueu is full");
        else if(size() == 0){
            start++;
            end++;
            data[end] = item;
        }
        data[end++] = item;
    }
    public E deQueue(){
        if(size()==0) throw new IllegalArgumentException("Queue is empty");
        E ans = null;
        if(start == end){
            ans = data[start];
            start = -1;
            end = -1;
        }
        else {
            ans = data[start];
            start++;
        }
        return ans;
    }

}
