package hw_11;

public class SumOfArray {
    public static void main(String[] args) {
        /* Задача2
Реализуйте метод sumOfArray (сумма элементов массива),
который получает на вход массив и определяет сумму его элементов.
         */
        int[] array = {15, -777, 123, -4, 56, 89, 91};
        sumOfArray(array);
    }

    // ----------Methods -----------
    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }


    //-------------------------------
}
