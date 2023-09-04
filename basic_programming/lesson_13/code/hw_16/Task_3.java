package hw_16;
//Задание 3
//        Реализовать метод, выводящий на экран все делители введенного пользователем целого числа.
//        Вернуть массив со всеми делителями числа.
public class Task_3 {

    // ==============Methods===============
    public static int[] findAlDivsder(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0){
                counter++;
                System.out.println(i+"  ");
            }

        }
        System.out.println();
        int[] dividers = new int[counter];
        int index = 0;
        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                dividers[i] = i;
                index++;
            }
        }
        return dividers;
    }


    // =====================================
}
