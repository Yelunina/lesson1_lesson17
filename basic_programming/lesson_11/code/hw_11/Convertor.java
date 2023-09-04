package hw_11;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        /*Задача1
Реализуйте с помощью метода конвертор, который переводит скорость в милях в час в скорость в км/час.
1 миля равна 1609 метров.
 Метод получает на вход данные от пользователя с клавиатуры.
         */

        // вызываем метод
        convertor();
    }

    // ___________methods _____________
    public static void convertor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input speed in miles per hour: ");
        int miles = scanner.nextInt();
        double km = (double) miles / 0.62137;
        System.out.println("speed in miles per hour: " + miles);
        System.out.printf("speed in km per hour: %.2f ", km);

    }

    // __________end of methods ________
}
