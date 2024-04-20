import java.util.Scanner;

public class Task_5 {
    public void TAB() {
        Scanner scanner = new Scanner(System.in);

        // Введення границь проміжку
        System.out.print("Введіть початкову границю проміжку: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву границю проміжку: ");
        double end = scanner.nextDouble();

        // Введення кроку
        System.out.print("Введіть крок: ");
        double step = scanner.nextDouble();

        // Початок і кінець області значень
        double minRange = 3;
        double maxRange = 6;

        // Реалізація з оператором while
        System.out.println("Реалізація з оператором while:");
        int countWhile = 0;
        double xWhile = start;
        while (xWhile <= end) {
            double y = function(xWhile);
            if (y >= minRange && y <= maxRange) {
                countWhile++;
            }
            System.out.println("f(" + xWhile + ") = " + y);
            xWhile += step;
        }
        if (countWhile == 0) {
            System.out.println("Немає значень функції у заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функції в заданому діапазоні: " + countWhile);
        }

        // Реалізація з оператором for
        System.out.println("\nРеалізація з оператором for:");
        int countFor = 0;
        for (double xFor = start; xFor <= end; xFor += step) {
            double y = function(xFor);
            if (y >= minRange && y <= maxRange) {
                countFor++;
            }
            System.out.println("f(" + xFor + ") = " + y);
        }
        if (countFor == 0) {
            System.out.println("Немає значень функції у заданому діапазоні.");
        } else {
            System.out.println("Кількість значень функції в заданому діапазоні: " + countFor);
        }
    }

    // Опис функції
    public static double function(double x) {
        return 0.25 * Math.pow(x, 3) + x - 1.2502;
    }
}
