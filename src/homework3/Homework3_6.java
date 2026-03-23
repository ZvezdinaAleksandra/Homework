package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    /*Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего)*/
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
        boolean flag = true; // считаем, что массив изначально возрастающий

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) { // если текущий элемент меньше или равен предыдущему
                flag = false; // массив не возрастающий
                break; // дальше проверять не нужно
            }
        }

        if (flag) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }

    }
}
