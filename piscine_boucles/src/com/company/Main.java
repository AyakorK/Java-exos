package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.print("\033[H\033[2J");

        for (int i = 0; i <= 100; i++) {
            System.out.println(100 - i);
        }
        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }


        int a = 3;
        for (int b = 0; b <= 10; b++) {
            System.out.println(Math.pow(a, b));
        }
        int c = 9;
            System.out.println("Table de multiplication de " + c + ": \n");
        for (int d = 0; d <= 10; d++) {
            System.out.println(c + " * " + d + " = " + c * d);
        }
        int M = 500;
        int sum = 0;
        for (int N = 1; N <= 100; N++) {
            if (sum > M) {
                break;
            }
            sum += N;
            System.out.println(sum);
        }

        String name = "Guillaume";
        int length = name.length();
        String finalName = "";
        System.out.println(name.length());
        for (int i = length-1; i >= 0; i--) {
            finalName += name.charAt(i);
        }
        System.out.println(finalName+"\n");
        finalName = "";
        for (int i = 0; i <= length-1; i++) {
            finalName += name.charAt(i);
        }
        System.out.println(finalName+"\n");

    }
}
