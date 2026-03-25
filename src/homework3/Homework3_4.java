package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    /*Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет*/
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
        int count = 0; // переменная для подсчета нулевых элементов

// проходим по всему массиву
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++; // увеличиваем счетчик, если нашли 0
            }
        }

// проверяем результат
        if (count == 0) {
            System.out.println("Нулевых элементов нет");
        } else {
            System.out.println("Количество нулевых элементов: " + count);
        }

    }

}
