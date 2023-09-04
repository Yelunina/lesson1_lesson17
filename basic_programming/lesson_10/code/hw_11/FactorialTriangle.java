package hw_11;

public class FactorialTriangle {
    public static void main(String[] args) {
        /* Задача2
Оформить решение задачи 1 про факториал
 и задачи 4 про треугольник из предыдущего домашнего задания в виде методов
         */
        factorial();
        triangle();
    }

    //начало методов

    public static void factorial() {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " = " + fact);
        System.out.println();

    }


    public static void triangle() {
        System.out.println(" Triangle ");
        int m = 6;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    //конец методов
}

