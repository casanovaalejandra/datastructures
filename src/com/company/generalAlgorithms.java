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
    public List<Integer> insertionSortIncreasing(int[] arr) {
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
    public List<Integer> insertionSortDecreasing(int[] arr){
        if(arr.length == 0 || arr.length ==1) return Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i = 0; i < arr.length; i++){
            Integer value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole-1] < value){
                arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = value;
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
    public List<Integer> merge(List<Integer> array, int start, int middle, int end){
        int n1 = middle - start +1;
        int n2 = end - middle;
        Integer left[] = new Integer[n1];
        Integer right[] = new Integer[n2];

        for(int i = 1; i< n1; i++){
            left[i] = array.get(start + i - 1);
        }
        for(int j = 1; j<n2; j++){
            right[j] = array.get(middle+j);
        }
        int i = 1;
        int j = 1;
        for(int k = start; k <= end; k++){
            if(left[i]<= right[j]){
                array.set(k,left[i]);
                i++;
            } else {
                array.set(k, right[j]);
                j++;
            }

        }
        return array;

    }
}