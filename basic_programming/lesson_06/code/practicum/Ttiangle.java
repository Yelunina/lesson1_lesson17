package practicum;

public class Ttiangle {
    public static void main(String[] args) {
        /* Задание 3. Даны 3 целых числа 10, 3 и 2 - длины отрезков.
         Проверьте, можно ли из них составить треугольник или нельзя?
         */
        int  a = 10;
        int b = 3;
        int c = 2;

        if ( a < (b+c) && b< (a + c) && c< (a + b)) {
            System.out.println(" Yes, triangle exists! ");
        } else {
            System.out.println(" No, triangle does not exist");
        }

    }
}
