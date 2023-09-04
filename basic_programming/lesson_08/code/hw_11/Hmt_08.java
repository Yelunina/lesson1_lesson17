package hw_11;
import java.util.Random;
public class Hmt_08 {
    public static void main(String[] args) {
        /*  Задача 1
        Собрать в массив данные о росте (или возрасте) членов группы.
        Выведите на печать максимальное и минимальное значение. */
        int[] age = {23,22,56,18,61,43};

        int max = age[0];
        int min = age[0];

        int i = 0; // создаем переменную, которая будет у нас увеличиватся в цикле

        while (i<age.length) {
            if ( age[i] > max) {
                max = age[i];
            } else if ( age[i] < min){
                min = age[i];
            }
            i++;
        }
        System.out.println("max =   " + max + ";   min=  " + min);

         /*   Задача 2
        Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        Найдите максимальный элемент массива и его индекс.
        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38}; */

        int[] ints = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        System.out.println();
        int i1 = 0;
        int max1 = ints[0];
        int index = 0;
        while (i1 < ints.length) {
            if (ints[i1] > max1) {
                max1 = ints[i1];
                index  = i1;
            }
            i1++;
        }
        System.out.println("max elt is "+ max1 + " and its index is" + index);

       /* Задача 3
        Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
      Выведите массив на печать. Поменяйте местами первый и последний элементы массива
       и снова выведите массив на печать.
       random.nextInt( max -min + 1) + min
       */

        Random random = new Random();
        int[] nums= new int[20];
        int maxRandom = 20;
        int minRandom = 10;
        int j = 0;
        while (j < nums.length){
            nums[j] = random.nextInt(maxRandom-minRandom +1)+minRandom;
            System.out.print(nums[j] + "    ");
            j++;
        }
        int temp = nums[0]; //первый
        nums[0] = nums[nums.length - 1];//последний
        nums[nums.length - 1] = temp;//первый
        System.out.println();
        System.out.println("print swapped array");
        j = 0;
        while ( j < nums.length) {
            System.out.print(nums[j] + "   ");
            j++;
        }







    }
}
