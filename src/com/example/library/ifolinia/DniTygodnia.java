package com.example.library.ifolinia;

public class DniTygodnia {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Poniedziaek");
                break;

            case 2:
                System.out.println("Wtorek");
                break;

            case 3:
                System.out.println("Sroda");
                break;

            case 4:
                System.out.println("Czwartek");
                break;

            case 5:
                System.out.println("Piatek");
                break;

            case 6:
                System.out.println("Sobota");
                break;

            case 7:
                System.out.println("Niedziela");
                break;

        }

        if (day > 7)

        {
            System.out.println("Blad");
        } else if (day < 1)

        {
            System.out.println("Blad");
        }
    }
    }
