package com.company;

public interface BTSInterface<E> {
    public void addTo(TreeNode node, TreeNode root);
    public TreeNode contains (TreeNode parent);
    public TreeNode findWithParent(E element, TreeNode root);
    public TreeNode remove (E e);
}
