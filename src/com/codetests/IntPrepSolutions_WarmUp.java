package com.codetests;

public class IntPrepSolutions_WarmUp {

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

    static long repeatedString(String s, long n) {
        long result = 0;
        int numberOfAs = 0;
        long remainingChars = n%s.length();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a')
                numberOfAs++;
        }

        result = (n/s.length())*numberOfAs;

        if( remainingChars != 0){
           for(int i = 0; i < remainingChars; i++){
               if(s.charAt(i) == 'a')
                   result++;
           }
        }

        return result;
    }

    public static void main(String[] args){
//        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));

        System.out.println(repeatedString("abcac", 10));
    }
}
