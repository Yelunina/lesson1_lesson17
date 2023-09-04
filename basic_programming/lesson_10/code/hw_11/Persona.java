package hw_11;

import java.util.Scanner;

public class Persona {
    public static void main(String[] args) {
        /*Задача1
Написать программу, которая принимает с клавиатуры имя , фамилию и возраст
(Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
First name: John
Last name: Smith
Age: 25*/
        //шаг 1: считать с клавиатуры имя пользователя
        Scanner scanner = new Scanner(System.in);//включили сканер
        System.out.println("Enter your name: "); //печатаем приглашение пользователю
        String name = scanner.nextLine();// создаем переменную, куда поступит то, что напечатает пользователь на клавиатуре


        //шаг 2: считать с клавиатуры фамилию  пользователя
        System.out.println("Enter your Last name: "); //печатаем приглашение пользователю
        String lastName = scanner.nextLine();// создаем переменную, куда поступит то, что напечатает пользователь на клавиатуре


        //шаг 3: считать с клавиатуры возраст  пользователя
        System.out.println("Enter your Age: "); //печатаем приглашение пользователю
        int age = scanner.nextInt();// создаем переменную, куда поступит то, что напечатает пользователь на клавиатуре
        System.out.println("First Name: " + name);
        System.out.println();
        System.out.println("Last name: " + lastName);
        System.out.println();
        System.out.println("Age: " + age);


    }
}
//
//import java.util.Scanner;
//
//public class Person_11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);// включаем прием данных с клавиатуры
//        System.out.println("Input your name");//приглашение пользователя
//        String name = scanner.nextLine();//принимает данные с клавиатуры от пользователя
//        System.out.println("Input your last name");//приглашение пользователя
//        String lastName = scanner.nextLine();//принимает данные с клавиатуры от пользователя
//        System.out.println("Input your age");//приглашение пользователя
//        int age = scanner.nextInt();//принимает данные с клавиатуры от пользователя
//        //выводим полученные данные на экран ( в консоль)
//        System.out.println("Your name: " + name);
//        System.out.println();
//        System.out.println("Your last name: " + lastName);
//        System.out.println();
//        System.out.println("Your age: " + age);
//
//    }
//}
