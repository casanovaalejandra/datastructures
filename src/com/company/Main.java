package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        generalAlgorithms alg = new generalAlgorithms();
        int[] arr = {2,8,5,6,0,1};
        List<Integer> sortedArr = alg.insertionSortIncreasing(arr);
        System.out.println(sortedArr);
        List<Integer> sortedArrayDecreasing = alg.insertionSortDecreasing(arr);
        System.out.println(sortedArrayDecreasing);

        //candy crush algorithm debugging
        int[][] board = {{0,1,0},{0,1,2},{2,1,3}};
        int[][] result = alg.candyCrush(board);
        System.out.println("result: "+result.toString());
    }

}
