package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        generalAlgorithms alg = new generalAlgorithms();
        int[] arr = {2,8,5,6,0,1};
        List<Integer> sortedArr = alg.insertionSort(arr);
        System.out.println(sortedArr);
    }

}
