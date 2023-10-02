package PracticeJava;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 10;
        //upper pattern
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower pattern
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
