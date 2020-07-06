package com.company;

public abstract class TreeNode<E>  implements TreeNodeInterface<E> {
    private E data;
    private TreeNode<E> node;
    @Override
    public E get() {
        return data;
    }
    @Override
    public void set(E data) {
        this.data = data;
    }
}
