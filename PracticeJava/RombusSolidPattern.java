package PracticeJava;

public class RombusSolidPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
