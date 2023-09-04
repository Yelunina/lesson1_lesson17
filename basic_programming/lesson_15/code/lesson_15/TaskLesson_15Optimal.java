package lesson_15;

public class TaskLesson_15Optimal {
    public static void main(String[] args) {
//        Написать метод. который получает массив целых чисел, и возвращает последнее число в массиве, которое меньше 0

        int[] array = {6,3,5,2,-7,4,-2,3};// result will be -2
        int[] array1 = {6,3,5,2,4,3};// result will be 0
        System.out.println(getLastNumberLessThenZero(array));

    }
    // ==============Methods===============

    public static int getLastNumberLessThenZero( int [] array) {
        int result = 0;
        for (int i = array.length-1 ;i>=0; i--) {
            if (array[i]<0){
                return array[i];
            }
        }
        return result;

    }

    // ===============================

}
