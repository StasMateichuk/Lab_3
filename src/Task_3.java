public class Task_3 {
    public void WHILE() {

        System.out.println("\nВиведення за допомогою циклу while:");
        int hours = 0;
        int minutes = 0;
        int count = 0;

        while (hours < 3) {
            System.out.print(hours + " h " + minutes + " min\t");
            minutes++;
            count++;
            if (minutes == 60) {
                hours++;
                minutes = 0;
            }
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
