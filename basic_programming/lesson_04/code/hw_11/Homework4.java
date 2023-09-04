package hw_11;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Homework");

        System.out.println();
        System.out.println("task 1 ");
                // Написать программу, вычисляющую и выводящую на печать ASCII значение символа 'B'.
        int chInt = 'B';
        System.out.println("chInt is "+chInt);
        chInt = 'C';
        System.out.println(chInt);
        chInt++;
        System.out.println(chInt);

        System.out.println();

        System.out.println("task 2 ");
        /* Даны две строки а и в. Написать программу, соединяющую их и выводящую на экран в виде abba,
        Например "Hi" и "Bye" должны быть напечатаны как HiByeByeHi*/
        String a = "a" ;
        String b = "b";
        String c = a+b+b+a;
        System.out.println(c);

        String a1 = "Hi";
        String a2 = "Bye";
        String a3 = a1+a2+a2+a1;
        System.out.println(a3);

        System.out.println();
        System.out.println("task 3 ");
        /* Написать программу, выводящую на экран символ строки с индексом 2.
        Например, если строка Java, то результат будет 'v'*/

        String java = "Java";
        char ch = java.charAt(2);
        System.out.println(ch+"");

        String people = "People";
        char ch1 = people.charAt(2);
        System.out.println(ch1+"");

        System.out.println();
        System.out.println("task 4 ");
        /* Написать программу, выводящую на экран целое число, равное двойной длине строки.
         Т.е. если есть строка Java, то ответ будет 8 */

        int len = java.length();
        System.out.println("Число, равное двойной длине строки Java = "+len *2);
        int lenPeople = people.length();
        System.out.println("Число, равное двойной длине строки People = "+lenPeople *2);


    }
}
