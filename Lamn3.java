public class Lamn3 {
    public static void main(String[] args) {
        System.out.println("**       **");
        System.out.println("* *     * *");
        System.out.println("*  *   *  *");
        System.out.println("*   * *   *");
        System.out.println("*    *    *");
        //By Loop
        for(int i=1;i<=5;i++){
            System.out.print("*");
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=9-2*i;j++){
                System.out.print(" ");
            }
            if(i!=5)System.out.print("*");
             for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
