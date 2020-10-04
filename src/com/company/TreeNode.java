package com.company;

public class TreeNode<Integer>  implements TreeNodeInterface<Integer> {
    private Integer data;
    private TreeNode<Integer> node;
    private TreeNode<Integer> left;
    private TreeNode<Integer> right;

    public TreeNode<Integer> getParent() {
        return parent;
    }

    public void setParent(TreeNode<Integer> parent) {
        this.parent = parent;
    }

    private TreeNode<Integer> parent;
    public TreeNode(Integer data){
        this.data = data;
    }

    public Integer get() {
        return data;
    }

    public void set(Integer data) {
        this.data = data;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public  TreeNode getLeft(){
        return this.left;
    }

}
