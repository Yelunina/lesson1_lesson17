package practicum;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        /* Задание 1. Имеется целое число n, задайте его самостоятельно в программе.
         Выясните, является ли это число четным?
         Является ли это число кратным 3? Кратным 5? Кратным 10?
         */
        int n = 18;
        if (n % 2 == 0 ) {
            System.out.println("The number is even ");
        } else {
            System.out.println("The number is odd");
        }

        int k = 11;
        if (k % 3 == 0 ) {
            System.out.println("The number " + k + " is divided  *3 ");
        } else {
            System.out.println("The number " + k + " is not divided *3");
        }

        int l = 45;
        if (l % 5 == 0 ) {
            System.out.println("The number " + k + " is divided  *5 ");
        } else {
            System.out.println("The number " + k + " is not divided *5");
        }



    }
}
