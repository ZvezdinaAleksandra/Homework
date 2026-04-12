package homework8;
/*Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
Задача 2:
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo" */

public class Homework8 {
    //задача 1
    public static void findShortestAndLongest(String s1, String s2, String s3) {
        String shortest = s1;
        String longest = s1;

        if (s2.length() < shortest.length()) shortest = s2;
        if (s2.length() > longest.length()) longest = s2;

        if (s3.length() < shortest.length()) shortest = s3;
        if (s3.length() > longest.length()) longest = s3;

        System.out.println("Самая короткая строка: \"" + shortest + "\" (длина " + shortest.length() + ")");
        System.out.println("Самая длинная строка: \"" + longest + "\" (длина " + longest.length() + ")");
    }
    //задача 2
    public static void sortByLength(String s1, String s2, String s3) {
        String first = s1;
        String second = s2;
        String third = s3;


        if (first.length() > second.length()) {
            String temp = first;
            first = second;
            second = temp;
        }

        if (second.length() > third.length()) {
            String temp = second;
            second = third;
            third = temp;
        }

        if (first.length() > second.length()) {
            String temp = first;
            first = second;
            second = temp;
        }


        System.out.println("Строки по возрастанию длины:");
        System.out.println(first + " (длина " + first.length() + ")");
        System.out.println(second + " (длина " + second.length() + ")");
        System.out.println(third + " (длина " + third.length() + ")");
    }
    //задача 3
    public static void printShorterThanAverage(String s1, String s2, String s3) {

        double average = (s1.length() + s2.length() + s3.length()) / 3.0;

        System.out.println("Средняя длина строк: " + average);
        System.out.println("Строки, длина которых меньше средней:");


        if (s1.length() < average) System.out.println(s1 + " (длина " + s1.length() + ")");
        if (s2.length() < average) System.out.println(s2 + " (длина " + s2.length() + ")");
        if (s3.length() < average) System.out.println(s3 + " (длина " + s3.length() + ")");
    }
    //задача 4
    public static void findFirstUniqueCharsWord(String w1, String w2, String w3) {
        System.out.println("Слово с различными символами:");


        if (isAllCharsUnique(w1)) {
            System.out.println(w1);
        } else if (isAllCharsUnique(w2)) {
            System.out.println(w2);
        } else if (isAllCharsUnique(w3)) {
            System.out.println(w3);
        } else {
            System.out.println("Нет слова с уникальными символами");
        }
    }


    public static boolean isAllCharsUnique(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (word.indexOf(c) != word.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
//задача 5

    public static String doubleEachChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result + c + c;
        }

        return result;
    }
}

