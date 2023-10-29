public class Lamn2 {
    public static void main(String[] args) {
        System.out.println("      *     ");
        System.out.println("     * *   ");
        System.out.println("    *****  ");
        System.out.println("   *     * ");
        System.out.println("  *       *");
        // By Loop
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2; j <=2*i-1; j++) {
                if (i == 3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (i != 1)
                System.out.print("*");
            System.out.println();
        }
    }
}
