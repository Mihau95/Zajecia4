package com.example.library.ifolinia;

public class Ifolgia {
    public static void main(String[] args) {
        int number = 9;

        switch(number%2) {
            case 0:
                System.out.printf("Liczba jest parzysta");
                break;
                case 1:
                    System.out.printf("Liczba jest nieparzysta");
                    break;

                    case -1:
                        System.out.printf("Liczba jest ujemna");
                        break;
        }
    }

}
