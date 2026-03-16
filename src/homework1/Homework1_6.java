package homework1;

public class Homework1_6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a); //выведет 2
        System.out.println(b); //выведет 1
    }
}