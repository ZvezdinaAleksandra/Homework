package homework8;

import java.util.Scanner;

import static homework8.Homework8.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();


        findShortestAndLongest(str1, str2, str3);
        sortByLength(str1, str2, str3);
        printShorterThanAverage(str1, str2, str3);
        findFirstUniqueCharsWord(str1, str2, str3);

        System.out.println("Введите строку для удвоения букв:");
        String input = scanner.nextLine();

        System.out.println("Строка с удвоенными буквами:");
        System.out.println(doubleEachChar(input));

        scanner.close();
    }
}
