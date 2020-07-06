package com.company;

public class BasicLinkedList<E> {
    private Node first;
    private Node last;
    private int nodeCount;
    public BasicLinkedList() {
        this.first = null;
        this.last = null;
        nodeCount = 0;
    }
    public int size(){
        return this.nodeCount;
    }
    public void add (E item){
        if(first == null){
            first = new Node(item);
            last = first;
        }else{
            Node n = new Node(item);
            last.setNextNode(n);
            last = n;
        }
    nodeCount++;

    }
    public E remove() {
        if (first == null) {
            throw new IllegalArgumentException("The list is empty");
        }
        E curr = this.first.getNodeItem();
        first = first.getNextNode();
        nodeCount--;
        return curr;
    }
    private class Node {
        private Node nextNode;
        private E nodeVal;

        public Node(E item) {
            this.nodeVal = item;
            this.nextNode = null;

        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node next) {
            this.nextNode = next;
        }

        public E getNodeItem() {
            return this.nodeVal;
        }
    }
}
