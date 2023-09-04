package hw_12;

public class Array {
    public static void main(String[] args) {
//         Задача 2
//Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
//если нет false.
//static boolean checkOnesAndZeros( int[] ints)
//В методе main() вывести получившийся результат на экран
        int[] array = {999,23,28,10,-38,8,-1,1001,56};

        System.out.println(checkOnesAndZeros(array));
        // вызываем метод
    }
    // ___________methods _____________
    public static boolean checkOnesAndZeros( int[] ints){
        boolean flag = false;
        for (int i = 0; i <ints.length ; i++) {
            if(ints[i] == 0 || ints[i] ==-1) {
                flag = true;
            }
        }
        return flag;
    }



    }

    // __________end of methods ________

