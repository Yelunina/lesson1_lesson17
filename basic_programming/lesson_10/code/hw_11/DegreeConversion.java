package hw_11;

import java.util.Scanner;

public class DegreeConversion {
    public static void main(String[] args) {
        /*Задача3
 Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
 Формула для расчета С = 5*(F-32)/9. Результат вывести на экран
         */
        degreeConversion();
    }

    public static void degreeConversion() {
        Scanner scanner = new Scanner(System.in);//включили сканер
        System.out.println(" Пожалуйста введите температуру по Фаренгейту");//печатаем приглашение пользователю
        float f = scanner.nextInt();// создаем переменную, куда поступит то, что напечатает пользователь на клавиатуре

        float c = 5 * (f - 32) / 9;
        //создаем переменную для градусов цельсия и формулу для перевода градусов по фаренгейту в шкалу цельсия150
        System.out.printf(" Температура по Цельсию =  %.2f ", c); // печатаем результат перевода градусов по фаренгейту в шкалу цельсия


    }
}
//import java.util.Scanner;
//
//public class ConvertorFtoC {
//    public static void main(String[] args) {
//        //конвертор ( методом) Фаренгейт в Цельсий. Формула -  С = 5*(F-32)/9.
//
//        //вызов метода
//        convertorFtoC();
//    }
//    //--------methods--------
//    public static void convertorFtoC() {
//        //тело метода
//        System.out.println(" Input temperature in F (positive, integer): ");
//        Scanner scanner = new Scanner(System.in);
//        int tempF = scanner.nextInt();
//        double tempC = 5.0 * ((double) tempF-32) / 9.0;
//        System.out.printf("Temperature in C = %.2f ", tempC);
//
//    }
//    //---------end of methods-------
//}

