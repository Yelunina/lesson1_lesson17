package practicum;

public class Calculator {
    public static void main(String[] args) {
        /* Задание 5. Реализуйте простой калькулятор с четырьмя действиями,
        используя switch ... case
         */
        int num1 = 23;
        int num2 = 47;

        String  action = "-";

        switch (action){
            case "+" : {
                System.out.println(num1 + num2);
                break;
            }
            case "-" : {
                System.out.println(num1 - num2);
                break;
            }
            case "*" : {
                System.out.println(num1 * num2);
                break;
            }
            case "/" : {
                System.out.println(num1 / num2);
                break;
            }
            default: {
                System.out.println("No action");
            }
        }

    }
}
