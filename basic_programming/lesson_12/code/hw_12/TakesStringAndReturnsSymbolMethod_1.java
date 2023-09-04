package hw_12;

public class TakesStringAndReturnsSymbolMethod_1 {
    public static void main(String[] args) {
         /*Задача 1
Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
Пример : Hello-> EL
В методе main() вывести получившийся результат на экран */
        String st = "Hello";
        String res = hello2Symbols(st);//вызвали метод, передали в него st, результат метода присвоили в переменную
        System.out.println(res);//напечатали
        // альтернативо
        System.out.println(hello2Symbols(st));


        // вызываем метод, который обработает строку
    }
    // ___________methods _____________
    public static String hello2Symbols (String s){
        return s.substring(1,3).toUpperCase();//метод возвращает второй и третий символы строки заглавными буквами

    }

    // __________end of methods ________
}
