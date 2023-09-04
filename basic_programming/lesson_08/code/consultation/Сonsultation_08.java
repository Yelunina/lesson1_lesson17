package consultation;

public class Сonsultation_08 {
    public static void main(String[] args) {
        /* Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка,
         используя цикл while
         */
        System.out.println("7 чисел от 1 до 100, которые делятся на 5 без остатка");

        int number1 = 1;
        int count =1;
        while ( number1 <= 100 & count <= 7) {
            if (number1 % 5 == 0) {
                System.out.println(number1);
                count++;
            }
            number1++;
        }





    }
}
