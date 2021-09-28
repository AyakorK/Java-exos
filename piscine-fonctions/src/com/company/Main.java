package com.company;

public class Main {
    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int abs(int a) {
        return a >= 0 ? a : -a;
        }


    static int sum(int a) {
        int somme = 0;
        for (int i = 0; i <= a; i++) {
            somme += i;
        }
        return somme;
    }

    static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    static String div(String name) {
        int length = name.length();
        String finalName = "";
        for (int i = length - 1; i >= 0; i--) {
            finalName += name.charAt(i);
        }
        return finalName;
    }

    static String mult(float a){
        float d = 0;
        String result = " ";
        while (d<10) {
            d++;
             System.out.println("Table de multiplication de " + a + " : " + a * d);
        }
        return result ;
    }
    static String leap(int year) {
        boolean bissextile = true;
        String leap="";
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " " + "est bisextile");
            bissextile = true;
        } else {
            System.out.println(year + " " + "n'est pas bisextile");
            bissextile = false;

        }
        return leap;
    }
    static String valid(int year, int month, int day) {
        int mois31[] ={1,3,5,7,8,10,12};
        boolean is31 = false;
        boolean valid=false;
        String vide = "";
        boolean bissextile = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            bissextile = true;
        } else {
            bissextile = false;

        }
        for (int i = 0 ; i<mois31.length ; i++) {
            if (mois31[i] == month) {
                is31 = true;
            }
        }

        if (is31 && day <= 31) {
            valid=true;
        } else if (month == 2 && day==29 && bissextile == true) {
            valid=true;
        }  else if (month == 2 && day==29 && bissextile == false) {
            valid = false;
        } else if (month != 2 && is31 == false && day<=30){
            valid = true;
        } else {
            valid = false;
        }
        if (valid == true) {
            System.out.println(day + "/"  + month + "/" + year + " " + "est une date valide !");
        } else {
            System.out.println(day + "/" + month + "/" + year + " " + "est une date invalide !");
        }
        return vide;
    }


    public static void main(String[] args) {
	int a = 4;
    int b = 3;
    int year = 1938;
    int month = 07;
    int day = 02;

    String name = "Guillaume";
    int min = min(a,b);
    System.out.println(min);
    int abs = abs(a);
    System.out.println(abs);
    int sum = sum(a);
    System.out.println(sum);
    int pow = pow(a,b);
    System.out.println(pow);
    String div = div(name);
    System.out.println(div);
    String mult = mult(a);
    System.out.println(mult);
    String leap = leap(year);
    System.out.println(leap);
    String valid = valid(year, month, day);
    System.out.println(valid);
    }
}




