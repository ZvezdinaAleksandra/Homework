package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    /*Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.*/

    public static void main(String[] args) {
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
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i]; // сохраняем текущий элемент (с начала)
            numbers[i] = numbers[numbers.length - 1 - i]; // ставим элемент с конца на место начала
            numbers[numbers.length - 1 - i] = temp; // ставим сохраненный элемент на место конца
        }
        System.out.println(Arrays.toString(numbers));
    }
}

