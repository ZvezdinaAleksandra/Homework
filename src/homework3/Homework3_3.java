package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    /*Найти индексы минимального и максимального элементов и вывести в консоль*/
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
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            } else if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println(" Мин : "  + minIndex); // выводим минимальный индекс
        System.out.println(" Макс : "  + maxIndex); // выводим максимальный индекс
    }
}
