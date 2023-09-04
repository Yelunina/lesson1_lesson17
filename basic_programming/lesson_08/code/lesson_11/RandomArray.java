package lesson_11;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
//        Задача 3. Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//        Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
//        Создайте и используйте метод searchInArray,
//        который получает на вход массив и искомое число, а возвращает ответ - нашлось ли это число в массиве.
        int[] randomArray = new int[10]; //обьявили массив
        // нужно заполнить массив случайніми числами
        int a = 1;
        int b = 100;
         int i = 0; //индекс
         while (i < randomArray.length) {
           randomArray[i] = (int)(Math.random()*(b-a+1)+a);  // заполнение случайными числами
             System.out.print(randomArray[i] + "|");
           i++;
         }
        System.out.println();
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input number: ");
         int n = scanner.nextInt();
         boolean flag = false;
         i = 0;
         while (i < randomArray.length) {
             if (randomArray[i] == n) {
                 flag = true;
                 break;
             }
             i++;
         }
         if (flag) {
                System.out.println("Bingo!");
                } else {
             System.out.println("Sorre...");
         }
    }
}
