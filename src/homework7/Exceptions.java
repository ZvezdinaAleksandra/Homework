package homework7;

public class Exceptions {
    public void firstMethod(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
        System.out.println("Программа все равно работает :)");
    }

    public void secondMethod(String[] arr, String numberStr) {
        try {
            int indexValue = Integer.parseInt(numberStr);
            System.out.println("Элемент массива: " + arr[indexValue]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс выходит за пределы массива!");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена не цифра!");
        }
        System.out.println("Программа все равно работает :)");
    }
    public void thirdMethod(String[] arr) {
        try {
            System.out.println(arr[0].length());
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: либо массив пустой, либо индекс не существует!");
        }
        System.out.println("Программа все равно работает :)");
    }
    public void fourthMethod(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        } finally {
            System.out.println("Блок finally выполнен.\n");
        }
        System.out.println("Программа все равно работает :)");
    }
}



