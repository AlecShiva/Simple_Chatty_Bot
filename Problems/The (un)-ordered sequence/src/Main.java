import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean isDescending = false;

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        while (val1 >= val2) {
            if (val1 > val2 && isDescending == false) {
                isDescending = true;
            }
            if (val2 == 0) {
                System.out.println(true);
                return;
            }
            val1 = val2;
            val2 = scanner.nextInt();
        }

        if (val1 < val2) {
            if (isDescending == true) {
                System.out.println(false);
                return;
            }
        }

        while (val1 <= val2) {
            val1 = val2;
            val2 = scanner.nextInt();
            if (val2 == 0) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
        return;

    }
}