package com.company;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class generalAlgorithms {
    public List<String> generatePermutations(String str) {
        return null;
    }

    public List<String> generateCombinations(String str) {
        return null;
    }

    public List<Integer> insertionSortIncreasing(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 1; i < arr.length; i++) {
            Integer value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public List<Integer> insertionSortDecreasing(int[] arr) {
        if (arr.length == 0 || arr.length == 1) return Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i < arr.length; i++) {
            Integer value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] < value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public List<Integer> merge(List<Integer> array, int start, int middle, int end) {
        int n1 = middle - start + 1;
        int n2 = end - middle;
        Integer left[] = new Integer[n1];
        Integer right[] = new Integer[n2];

        for (int i = 1; i < n1; i++) {
            left[i] = array.get(start + i - 1);
        }
        for (int j = 1; j < n2; j++) {
            right[j] = array.get(middle + j);
        }
        int i = 1;
        int j = 1;
        for (int k = start; k <= end; k++) {
            if (left[i] <= right[j]) {
                array.set(k, left[i]);
                i++;
            } else {
                array.set(k, right[j]);
                j++;
            }

        }
        return array;

    }

    public int[][] candyCrush(int[][] board) {
        //STEP ONE WILL BE CHECK HORIZONTALLY WHICH  ONES ARE GOING TO BE CRUSHED
        int R = board.length;
        int C = board[0].length;
        boolean todo = false;
        for (int r = 0; r < R; ++r) {
            for (int c = 0; c + 2 < C; ++c) {
                int curr = Math.abs(board[r][c]);
                if (curr != 0 && curr == Math.abs(board[r][c + 1]) && curr == Math.abs(board[r][c + 2])) {
                    board[r][c + 1] = board[r][c + 2] = board[r][c] = -curr;
                    todo = true;
                }
            }
        }
        for (int r = 0; r + 2 < R; ++r) {
            for (int c = 0; c < C; ++c) {
                int curr = Math.abs(board[r][c]);
                if (curr != 0 && curr == Math.abs(board[r + 1][c]) && curr == Math.abs(board[r + 2][c])) {
                    board[r][c] = board[r + 1][c] = board[r + 2][c] = -curr;
                    todo = true;
                }
            }
        }
        for (int c = 0; c < C; ++c) {
            int wr = R - 1;
            for (int r = R - 1; r >= 0; --r) {
                if (board[r][c] > 0)
                    board[wr--][c] = board[r][c];
            }
            while (wr >= 0)
                board[wr--][c] = 0;

        }

        return todo ? candyCrush(board) : board;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        /* POSIBLE QUESTIONS
        Maximum size of matrix?
        would we encounter empty matrix?
        how do we want to return it?
        what other possible exceptions can we encounter?
        be careful with the index out of bounds
        */
        /*
        ALGORITHM
        1. define the points in the matrix
        2. define the positions:
            0 left to right
            1 top to bottom
            2 right to left
            3 bottom to top
        */


        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0) return result;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}