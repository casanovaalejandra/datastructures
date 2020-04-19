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
    public boolean contains(E item){
        boolean ans = false;
        if((size() == 0))ans = false;
        else{

            for(int i = start; i< end; i++){
                if(data[i].equals(item)) ans = true;
            }
        }
        return ans;
    }
    public E accesstem(E item){
        E ans = null;
        if(size() == 0) throw new IllegalArgumentException("The queue is empty");
        else{
            E curr = null;
            for(int i = 0; i< end; i++){
                curr = deQueue();
                if(curr.equals(data[i])) ans = curr;
            }
        }
        return ans;
    }
    public E access (int position){
        if(position>end || size() == 0) throw new IllegalArgumentException("The position is not valid.");
        E elem = null;
        int trueIndex = 0;
        for(int i = start; i<end; i++){
            if(trueIndex == position) return data[i];
        }trueIndex++;
        throw new IllegalArgumentException("no position found");
    }
}
