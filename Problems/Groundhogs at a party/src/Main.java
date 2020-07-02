import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend == true) {
            System.out.println((15 <= numCups) && (numCups <= 25));
        }
        else {
            System.out.println((10 <= numCups) && (numCups <= 20));
        }

    }
}