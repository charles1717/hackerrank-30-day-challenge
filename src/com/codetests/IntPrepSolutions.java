package com.codetests;

public class IntPrepSolutions {

    static int jumpingOnClouds(int[] c) {
        int minJumps = 0;
        int iterator = 0;

        while(iterator < c.length-1){
            if(iterator == c.length - 2){
                minJumps++;
                break;
            }

            else if(c[iterator+2] == 0){
                minJumps++;
                iterator = iterator+2;
            }

            else{
                minJumps++;
                iterator++;
            }
            System.out.println(iterator);
        }

        return minJumps;
    }

    public static void main(String[] args){
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}
