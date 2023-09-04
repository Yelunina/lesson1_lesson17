package hw_11;

public class ArrayOfIntegers {
    public static void main(String[] args) {
        /*Задача3
Написать метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
Сначала последний элемент, потом предпоследний, и т. д. */
        int[] array = {15, -777, 123, -4, 56, 89, 91};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        arrayOfIntegers(array);
    }
    // ----------Methods -----------
    public static void arrayOfIntegers(int[] revers) {
        for (int i = revers.length - 1; i >= 0 ; i--) {
            System.out.print(revers[i] + "  ");

        }

    }



    //-------------------------------
}
