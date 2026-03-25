package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        /*Пройти по массиву, вывести все элементы в прямом и в обратном порядке*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Пользователь вводит размер массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int numbers[] = new int[size]; // создаем массив указанного размера

        // Заполняем массив случайными числами от 0 до 10
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(11);
        }

        System.out.println(Arrays.toString(numbers)); // выводим массив в исходном порядке

        for (int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]); // выводим массив в прямом порядке
        }
       System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]); // выводим массив в обратном порядке
        }

    }
}