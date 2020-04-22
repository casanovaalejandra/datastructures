package com.company;

public class BasicLinkedList<E> {
    private Node first;
    private Node last;
    public BasicLinkedList() {
        this.first = null;
        this.last = null;
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