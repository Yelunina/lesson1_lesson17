package hw_12;

public class TakesStringAndReturnsSymbolMethod {
    public static void main(String[] args) {
        /*Задача 1
Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
Пример : Hello-> EL
В методе main() вывести получившийся результат на экран */
        String st = "Hello";//задали строковую переменную
        System.out.println(st);
        System.out.println();


        // вызываем метод, который обработает строку
        String st1 = hello(st);
        System.out.println(st1);

    }

    // ___________methods _____________ метод получает на вход строку, выкусывает 2 и 3 символы и переводит их в заглавные буквы
    public static String hello(String s) {
        String res = s.substring(1,3);//выкусываем второй и третий символы
//        System.out.println(res);
        res = res.toUpperCase();//переводим в заглавные буквы
//        System.out.println(res);
        return res;//возвращаем из метода результат
    }


    // __________end of methods ________
}
