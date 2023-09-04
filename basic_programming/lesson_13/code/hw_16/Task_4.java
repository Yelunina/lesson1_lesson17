package hw_16;

public class Task_4 {
    public static void main(String[] args) {
        /*Задача 4 (*)
        Написать метод, возвращающий минимальный и максимальный элемент из поданного ему на вход массива целых чисел.*/

    }
    // ==============Methods===============
    public static int[] findMaxMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        //  int[] minMax ={min,max} ;
        return new int[]{min, max};
    }



    // =====================================
}
