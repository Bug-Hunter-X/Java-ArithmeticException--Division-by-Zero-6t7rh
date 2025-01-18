public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 10 / x; // This line causes an ArithmeticException
        System.out.println(y);
    }
}