import java.util.Scanner;

public class Task_4 {
    public void FOW() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Виберіть тип циклу: ");
            System.out.println("1. for");
            System.out.println("2. while");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTimerUsingFor();
                    break;
                case 2:
                    displayTimerUsingWhile();
                    break;
                default:
                    System.out.println("Невірний вибір.");
            }
        } while (choice < 1 || choice > 2);
    }

    public static void displayTimerUsingFor() {
        int count = 0;
        for (int hour = 0; hour <= 2; hour++) {
            for (int min = 0; min < 60; min++) {
                for ( int sec = 0; sec < 60; sec++) {
                    System.out.print(hour + " h " + min + " min " + sec + " sec\t");
                    count++;
                    if (count == 50) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }

    public static void displayTimerUsingWhile() {
        int count = 0;
        int hour = 0;
        while (hour <= 2) {
            int minute = 0;
            while (minute < 60) {
                int second = 0;
                while (second < 60) {
                    System.out.printf("%d h %d min %d sec\t", hour, minute, second);
                    count++;
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                    second++;
                }
                minute++;
            }
            hour++;
        }
    }
}
