import java.util.Scanner;

public class Main {

    public static double divide(long a, long b) {
        double num1 = Double.parseDouble(String.valueOf(a));
        double num2 = Double.parseDouble(String.valueOf(b));
        double result = num1 /num2;
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}