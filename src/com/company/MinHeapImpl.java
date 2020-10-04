package com.company;

public class MinHeapImpl implements MinHeap<Integer>{
    TreeNode last;
    TreeNode root;

    public MinHeapImpl(TreeNode root){
        this.root = root;
        this.last = root;
    }
    @Override
    public TreeNode  min() {
        if(root == null) return root;
        TreeNode min = root;
        swapFromTop(root);
        return min;
    }

    @Override
    public void add(TreeNode node,  TreeNode root) {
        if(root == null) {
            this.root = node;
            this.last = node;
        } else if((Integer)root.get()> (Integer)node.get()){
            TreeNode newRoot = node;
            last = root;
            if(root.getRight() != null) newRoot.setRight(root.getRight());
            if(root.getLeft() != null) newRoot.setLeft(root.getLeft());
            root = newRoot;

         }
        else if(root.getLeft() == null ){
                root.setLeft(node);
                last = node;
                swapFromTop(this.root);

        } else if(root.getRight() == null){
                root.setRight(node);
                last = node;
                swapFromTop(this.root);
        }else  {
            add(node, last);
        }

    }

    @Override
    public TreeNode swapFromTop(TreeNode root) {
        //if it does not have any children
        if(root.getLeft() == null && root.getRight() == null ) return root;

        //if the left is smaller
        if(root.getLeft() != null && (Integer) root.get() > (Integer) root.getLeft().get()){
            TreeNode newRoot = root;
            newRoot.setLeft(root);
            root = newRoot;
            swapFromTop(root.getLeft());
        }
        //if the right is smaller
        else if(root.getRight() != null && (Integer)root.get() > (Integer) root.getRight().get()) {
            TreeNode newRoot = root;
            newRoot.setRight(root);
            root = newRoot;
            swapFromTop(root.getRight());
        }
        return root;
    }
    public TreeNode swapFromBotton(TreeNode node){
        if(node.getParent() == null) return node;
        if((Integer)node.get() < (Integer)node.getParent().get()){

        }

        return null;
    }

    public TreeNode getRoot(){
        return this.root;
    }


}
