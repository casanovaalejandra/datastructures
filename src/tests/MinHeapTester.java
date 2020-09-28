package tests;

import com.company.MinHeap;
import com.company.MinHeapImpl;
import com.company.TreeNode;

public class MinHeapTester {
    MinHeap minHeap = new MinHeapImpl(new TreeNode(3));
    public static void main(String[] args){
        MinHeapTester test = new MinHeapTester();
        test.addToHeap();
        test.removeMin();
        test.removeMin();
    }
    public void addToHeap(){
        minHeap.add(new TreeNode(4),minHeap.getRoot());
        minHeap.add(new TreeNode(6),minHeap.getRoot());
        minHeap.add(new TreeNode(2),minHeap.getRoot());
    }
    public void removeMin(){
        minHeap.min();
        System.out.println("Min: "+ (Integer)minHeap.getRoot().get());
    }

}
