package hw_11;

public class Hw_09_I {
    public static void main(String[] args) {
        System.out.println(" task 1");
              /*Задача 1
Написать программу, вычисляющую факториал числа 5.
Факториал числа - это произведение всех целых чисел от 1 до самого числа. Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
! -обозначение факториала.*/
        int number = 15;
        int factorial = number;

        for (int i = (number - 1); i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Факториал 5 это " + factorial);
        System.out.println(" task 2");
        /* Задача 2
Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("The number of even numbers in array is " + counter);*/
        int[] numbers = {12, 23, 56, 88, 44, 63, 20, 34, 48, 22};
        int evenNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) // проверка на четность
                evenNumber++;

        }

        System.out.println(evenNumber);

        /* Задача 3
Есть массив целых чисел. Написать программу,
 находящую разницу между значением максимального и минимального элементов. (max - min).*/
        System.out.println(" task 3");
        int[] num = {85,22, 73,5, 39,50};

        int max = num[0];
        int min = num[0];

        int i = 0;

        while( i < num.length){
            if( num[i] > max){
                max = num[i];

            }else if ( num[i] < min){
                min = num[i];
            }
            i++;
        }
        int differenceBetween = max-min;
        System.out.println("min  num is "+min+" , max num is "+max);
        System.out.println("Разница между значениями максимального и минимального элементов составляет "+ differenceBetween );
       



    }
}

