package com.company;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class generalAlgorithms {
    public List<String> generatePermutations(String str) {
        return null;
    }
    public List<String> generateCombinations(String str){
        return null;
    }
    public List<Integer> insertionSort(int[] arr) {
        if( arr.length == 0 || arr.length == 1) return Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 1; i < arr.length; i++){
            Integer value = arr[i];
            int hole = i;
            while(hole>0 && arr[hole-1]>value){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}