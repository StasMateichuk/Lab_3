public class Task_1 {
    public void FW() {
        String phrase = "+1 social credit ";

        System.out.println("\nВиведення за допомогою циклу for:");
        for (int i = 0; i < 50; i++) {
            System.out.print(phrase + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nВиведення за допомогою циклу while:");
        int count = 0;
        while (count < 50) {
            System.out.print(phrase + " ");
            if ((count + 1) % 5 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}