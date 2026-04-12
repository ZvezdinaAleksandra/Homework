package homework9;
/*Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();

        String[] parts = input.split(",");

        Set<Integer> numbers = new HashSet<>();

        for (String part : parts) {
            numbers.add(Integer.parseInt(part.trim()));
        }

        System.out.println(numbers);
    }
}