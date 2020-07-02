import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        System.out.println(word1.startsWith("J") || word1.startsWith("j"));

    }
}