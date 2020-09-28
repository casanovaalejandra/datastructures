package com.company;

public class MinHeapImpl implements MinHeap<Integer>{
    TreeNode last;
    TreeNode root;

    public MinHeapImpl(TreeNode root){
        this.root = root;
        this.last = root;
    }
    @Override
    public TreeNode  min(TreeNode  root) {
        if(root == null) return root;
        TreeNode min = root;
        swapFromTop(root);
        return min;
    }

    @Override
    public void add(TreeNode node) {
        if(root == null) {
            this.root = node;
            this.last = node;
        }
        else this.last = node;
        swapFromBotton(this.last);
    }

    @Override
    public TreeNode swapFromTop(TreeNode root) {
        //FINISH ITTTT!!
        if(root.getLeft() == null && root.getRight() == null ) return root;
        if((Integer) root.get() > (Integer) root.getLeft().get()){
            TreeNode newRoot = root;
            newRoot.setLeft(root);
            root = newRoot;
            swapFromTop(root.getLeft());
        }
        return null;
    }

    @Override
    public TreeNode  swapFromBotton(TreeNode  leaf) {
        return null;
    }
}
