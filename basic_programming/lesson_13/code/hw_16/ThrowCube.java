package hw_16;

import java.util.Arrays;
import java.util.Random;

/*Задача 1
Напишите метод, который имитирует бросание игрового кубика.
На вход методу подается число бросков, на выходе метод возвращает результаты всех бросков.
- кубик из 6 граней n = (int)(Math.random() * (6 - 1 + 1) + 1)*/
public class ThrowCube {
    public static void main(String[] args) {

        int[] result = throwCube(10);
        for (int element : result) {
            System.out.print(element + "  ");
        }
        System.out.println("\nPrint array with Arrays.toString");
        System.out.println(Arrays.toString(result));

        String arrString = Arrays.toString(result);
        System.out.println(arrString.charAt(0));
        String str = "[1,2,4,5,1,,6,3,5,2,2]";
    }
    // ==============Methods===============
    public static int[] throwCube(int numberOfTosses) {
        int[] result = new int[numberOfTosses];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(6)+1 ;
        }
        return result;
    }
    // =====================================
}
