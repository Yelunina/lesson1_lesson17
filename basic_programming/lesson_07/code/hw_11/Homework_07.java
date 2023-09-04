package hw_11;

public class Homework_07 {
    public static void main(String[] args) {
        System.out.println(" task 1 ");
      /*  Задача1

        С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n

        Пример:для числа n=3

        1 в кубе 1

        2 в кубе 8

        3 в кубе 27 */
        int n = 1;
        int cubeNumber = 1;
        int num = 15;

        while (n <= num) {
            cubeNumber = n * n * n;
            System.out.println(cubeNumber);
            n++;
        }

        System.out.println(" task 2 ");


       /* Задача2

        С помощью цикла while написать программу, выводящую на экран результат умножения данного цисла n
         на все целые числа от 0 до n

        Пример: для числа 3 результат будет 0, 3, 6, 9 */


        int n3 = 15;
        int i = 0;

        while (i <= n3) {
            System.out.println( n3*i );
            i++;
        }

    }
}