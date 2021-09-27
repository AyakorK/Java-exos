package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 17;
        int num1 = 80;
        int num2 = -2;
        int num3 = 30;
        int result = num1 * num2;
        float note1 = 12.3f;
        float note2 = 18.2f;
        int note3 = 20;
        float moy = (note1 + note3) / 2;
        String msg = "Coding";
        boolean isTrue = true;
        int note = 9;
        //int pair = num1 % 2;
        int année = 2003;
        int calcul = année / 4;
        boolean bisextil = true;
        int day = 29;
        int month = 2;
        int mois31[] ={1,3,5,7,8,10,12};
        boolean is31 = false;
        boolean valid=false;


        if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1 + " " + "est le plus petit !");
        } else if ((num2 < num3) && (num2 < num1)) {
            System.out.println(num2 + " " + "est le plus petit !");
        } else {
            System.out.println(num3 + " " + "est le plus petit !");
        }

        if (result > 0) {
            System.out.println("Ce produit est égal à" + " " + result + " " + "");
        } else {
            System.out.println("Ce produit est égal à" + " " + result + " " + " et est négatif !");
        }

        if (age >= 18) {
            System.out.println("Cette personne est majeure");
        } else {
            System.out.println("Cette personne est mineure");

        }

        if (note < 10) {
            System.out.println("Vous n'avez pas le bac !");
        } else if (note < 12) {
            System.out.println("Vous avez le bac sans mention !");
        } else if (note < 14) {
            System.out.println("Vous avez le bac avec la mention assez bien !");
        } else if (note < 16) {
            System.out.println("Vous avez le bac avec la mention bien !");
        } else if (note < 18) {
            System.out.println("Vous avez le bac avec mention très bien !");
        } else if (note < 20) {
            System.out.println("Vous avez le bac avec mention excellente !");
        } else {
            System.out.println("Vous avez le bac avec mention Tricheur vous êtes éliminé !");
        }


        if (num1 % 2 == 0) {
            System.out.println("Ce nombre est pair");
        } else {
            System.out.println("Ce nombre est impair");
        }

        if ((année % 4 == 0 && année % 100 != 0) || (année % 400 == 0)) {
            System.out.println(année + " " + "est bisextile");
            bisextil = true;
        } else {
            System.out.println(année + " " + "n'est pas bisextile");
            bisextil = false;
        }

        for (int i = 0 ; i<mois31.length ; i++) {
            if (mois31[i] == month) {
                is31 = true;
            }
        }

            if (is31 && day <= 31) {
                valid=true;
                System.out.println(month + " " + "se finit le 31");
            } else if (month == 2 && day==29 && bisextil == true) {
                System.out.println(month + " " + "se finit le 29");
                valid=true;
            }  else if (month == 2 && day==29 && bisextil == false) {
                System.out.println(month + " " + "se finit le 28");
                valid = false;
            } else if (month != 2 && is31 == false && day<=30){
                System.out.println(month + " " + "se finit le 30");
                valid = true;
            } else {
                valid = false;
            }

            if (valid == true) {
                System.out.println(day + "/"  + month + "/" + année + " " + "est une date valide !");
            } else {

                System.out.println(day + "/" + month + "/" + année + " " + "est une date invalide !");
            }

            }

        }







