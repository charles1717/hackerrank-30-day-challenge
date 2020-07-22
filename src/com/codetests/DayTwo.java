package com.codetests;

import java.util.Scanner;

public class DayTwo {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double total_cost = (meal_cost + (meal_cost * (tip_percent / 100.0)) +          (meal_cost * (tax_percent / 100.0)));
        int result = (int) Math.round(total_cost);
        System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
