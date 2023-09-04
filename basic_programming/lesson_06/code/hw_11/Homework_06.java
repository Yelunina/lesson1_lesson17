package hw_11;
public class Homework_06 {
    public static void main(String[] args) {
/* Задача 1.
Написать программу, выводящую на экран максимальное из трех целых чисел. Числа задайте самостоятельно внутри программы.
Решите эту задачу с помощью if ... else и также с помощью тернарного оператора. */
        System.out.println("task 1");
        int a = 45;
        int b = 7;
        int c = 95;

        if ( a > b & a > c) {
            System.out.println(" Максимальное число а, и оно = " + a );

        } else if ( b > a & b > c ){
            System.out.println( " Максимальное число b, и оно = " + b  );
        } else {
            System.out.println( " Максимальное число c, и оно = " + c );
        }
        int max;
        max = a > b ? (a > c ? a : c ): (b > c ? b : c);
        System.out.println(max);
        System.out.println();



/* Задача 2. В программе задаются случайным образом две целочисленные координаты x и y в интервале от -10 до 10.
 Определите, в какую четверть попадает точка с координатами ( x, y). */
        System.out.println("task 2");
        int x = -10;
        int y = 10;

        int z = (int)(Math.random() * (y - x + 1) + x);
        System.out.println(z);
        if (x > 0 && y > 0) {
            System.out.println("I");
        } else if (x < 0 && y > 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        } else  {
            System.out.println("IV");
        }
        System.out.println();

/* Задача 3. По данному числу n закончите фразу "На лугу пасется..."
одним из возможных продолжений: "n коров", "n корова", "n коровы", правильно склоняя слово "корова".
Входные данные: Дано целое положительное число n (n <= 10),
Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы,
например, 1 корова, 2 коровы, 5 коров. */
        System.out.println("task 3");
        int n = 1;

        if (n % 10 == 1) {
            System.out.println( "На лугу пасется " + n + " корова");
        } else if (n % 10 == 0 | (n % 10 >= 5 & n % 10 <= 9 )) {
            System.out.println("На лугу пасется " + n + " коров");
        } else {
            System.out.println( "На лугу пасется " + n + " коровы");
        }

        System.out.println();
/* Задача 4(*). Написать программу, определяющую является ли год високосным (значение года задается в программе).
Для того чтобы быть високосным, год должен: делится без остатка на 4 и либо не должен делится без остатка на 100,
 либо, если он делится на 100, то он должен делится также на 400.
 */
        System.out.println("task 4*");
        int w = 0000;
        int e = 3000;

        int q = (int)(Math.random() * (e - w + 1) + w);
        System.out.println(q);
        if (q %100==0 && q %400 ==0 )
            System.out.println("Высокосный год: количество дней в году: 366");

        else if (q % 4 == 0 && q % 100 > 0)
            System.out.println("Высокосный год: количество дней в году: 366");

        else if (q % 100 == 0)
            System.out.println("Обычный год: количество дней в году: 365");

        else
            System.out.println("Обычный год: количество дней в году: 365");

        }
    }
