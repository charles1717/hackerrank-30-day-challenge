package com.codetests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntPrepSol_Arrays {
    /**
     * The pattern you are looking for is the first 4 x 4 array of the 6 x 6 array i.e. starting at position (0,0) and working through that first row, you can form an hour glass up until (0,3)
     * Same logic happens if you start from (0,0) and work downwards, you can form an hour-glass up until (3,0)
     * The nested for loops represents the starting positions of the hourglass
     * At each starting position, sum up the elements that form the hourglass shape by adding the appropriate constant
     * @param arr
     * @return
     */
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        List<Integer> sumArray = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++)
            {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                sumArray.add(sum);
            }
        }
        Collections.sort(sumArray);

        return sumArray.get(15);
    }

    static int[] rotLeft(int[] a, int d) {
        int temp;
        for(int i = 1; i <= d; i++ ){
            for(int j = 0; j < a.length-1; j++){
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(rotLeft(new int[]{1,2,3,4,5}, 4)));
    }
}
