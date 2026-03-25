package homework2;

import java.util.Scanner;

public class Homework2_1 {
     /* Напишите программу, которая будет принимать на вход число из консоли
       и выводить сообщение: четное число или нет. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}






