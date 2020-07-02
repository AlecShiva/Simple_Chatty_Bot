import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numVals = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < numVals; ++i) {
            int nextValue = scanner.nextInt();
            if (nextValue % 6 == 0) {
                total = total + nextValue;
            }
        }

        System.out.println(total);

    }
}