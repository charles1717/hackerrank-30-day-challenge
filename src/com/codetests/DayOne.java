package com.codetests;

import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int j;
        double dd;
        String ss;

        j = scan.nextInt();
        dd = scan.nextDouble();

        ss = scan.next();
        ss = ss + scan.nextLine();

        System.out.println(i+j);
        System.out.println(d + dd);
        System.out.println(s + ss);

        scan.close();
    }
}
