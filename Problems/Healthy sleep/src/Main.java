import java.util.Scanner;

class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int minHours = scanner.nextInt();
     int maxHours = scanner.nextInt();
     int actualHours = scanner.nextInt();

     if (actualHours < minHours)
         System.out.println("Deficiency");

     else if (minHours <= actualHours && actualHours <= maxHours)
         System.out.println("Normal");

     else if (maxHours < actualHours)
         System.out.println("Excess");

    }
}