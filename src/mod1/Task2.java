package mod1;

public class Task2 { // Print out a christmas tree pattern using * and defined spaces.
    public static void main(String[] args) {
        int treeTimes = 1;
        String treeBase = "*";
        int gap = 5;
        String space = " ";

        // Dynamic:
        while (treeTimes != 9) {
            for (int i = gap; i > 0; i--) {
                System.out.printf("%s", space);
            }
            for (int i = treeTimes; i > 0; i--) {
                System.out.printf("%s", treeBase);
            }
            System.out.printf("\n");
            treeTimes += 2;
            gap--;
        }

        /**
         * 
         * // Static:
         * System.out.printf("%6.2s\n", "*");
         * System.out.printf("%5.2s\n", "***");
         * System.out.printf("%4.2s\n", "*****");
         * System.out.printf("%3.2s\n", "*******");
         * 
         */
    }
}
