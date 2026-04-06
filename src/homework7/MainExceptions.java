package homework7;

public class MainExceptions {
    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
        exceptions.firstMethod(10, 0);
        String[] arr = {"a", "b"};
        exceptions.secondMethod(arr, "2");
        exceptions.secondMethod(arr, "abc");
        exceptions.thirdMethod(null);
        exceptions.thirdMethod(new String[]{});
        exceptions.fourthMethod(10, 0);
        exceptions.fourthMethod(10, 2);
    }
}
