public class Task_2 {
    public void FOR() {

        System.out.println("\nВиведення за допомогою циклу for:");
        int count = 0;
        for (int hour = 0; hour <= 2; hour++) {
            for (int min = 0; min < 60; min++) {
                System.out.print(hour + " h " + min + " min\t");
                count++;
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}