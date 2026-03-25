package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    /*Найти минимальный - максимальный элементы и вывести в консоль*/
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
        int min = numbers[0]; // считаем первый элемент минимальным
        int max = numbers[0]; // считаем первый элемент максимальным

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) { // если нашли элемент меньше текущего минимума
                min = numbers[i];   // обновляем минимум
            }
            if (numbers[i] > max) { // если нашли элемент больше текущего максимума
                max = numbers[i];   // обновляем максимум
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}