package com.company;

import java.util.ArrayList;

public interface TreeInterface<E> {

    public TreeNode root();

    public void setLeft(TreeNode node);

    public void setRight(TreeNode node);

    public TreeNode getLeft();

    public TreeNode getRight();

    public ArrayList<E> preorder(TreeNode root);

    public ArrayList<E> postorder(TreeNode root);

    public ArrayList<E> inorder(TreeNode root);

}
