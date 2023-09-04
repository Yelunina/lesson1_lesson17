package lesson_10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.print("Your number: "+ num);
        in.close();

    }

}
