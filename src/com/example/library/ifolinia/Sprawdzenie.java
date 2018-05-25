package com.example.library.ifolinia;

public class Sprawdzenie {
    public static void main(String[] args) {
        int a = 10;
        if (a %2 == 0) {
            System.out.println("Jest parzysta");
        } else {
            System.out.println("Jest nieparzysta");
        }

        if (a > 0) {
            System.out.println("Jest dodatnia");
        } else {
            System.out.println("Jest ujemna");
        }
        if (a*9%6==0){
            System.out.println((a*9) + " podzielna przez 6");
        } else if(a*a <100) {
            System.out.println((a*a) + " jest nmniejszey od 100");

        }

    }
}
