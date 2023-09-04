package hw_11;

public class Homework_05 {
    public static void main(String[] args) {
        System.out.println("Homework_5");
        System.out.println();
        System.out.println("task 1");
        /* Задача 1
Есть строка четной длины. Написать программу, выводящую на экран первую половину этой строки.
Пример: есть Hell , результат He */
        String method = "Method";
        String subMethod = method.substring(0 , method.length()/2 );
        System.out.println("Первая половина строки Method = " + subMethod);

        System.out.println();
        System.out.println("task 2");
        /* Задача 2
Есть две переменные целого типа. Написать программу, выводящую на экран true если значение одной из переменных = 10
или сумма значения переменных равна 10.
Иначе на экран выводится false.
Пример: int a = 10, int b = 9 -> true
int a = 1 , int b = 9 -> true
int a = 4 , int b = 10 -> true
int a = 4 , int b = 3 -> false */
        int a, b;
        a = 5;
        b = 3;

        System.out.println(a==10 || b==10 || (a+b)==10);

        }

}

