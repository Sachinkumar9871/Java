public class Lamn1 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        System.out.print("* ");
        // By Loop
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++){
            System.out.println("*");
            if(i==5){
                for(int j=1;j<=i;j++)System.out.print("* ");
            }
        }

    }
}
