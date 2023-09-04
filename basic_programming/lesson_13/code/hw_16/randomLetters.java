package hw_16;

import java.util.Arrays;
import java.util.Random;

public class randomLetters {
    /*Задача 2
Реализуйте метод, который заполняет массив случайными буквами.
Размер массива подается на вход методу.   */
    public static void main(String[] args) {
        System.out.println("print Letters");
        System.out.println(Arrays.toString(randomLetters(20)));

    }
    // ==============Methods===============
    public static char[] randomLetters(int length) {
        char[] letters = new char[length];
        Random random = new Random();

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (random.nextInt(90-65)+65);


        }
        return letters;

    }



    // =====================================
}
