package Recursion;

public class Factrial {

    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
            result = fact(n-1)*n;
            return result;
        }
}
class Main{
    public static void main(String[] args) {
        Factrial c = new Factrial();
        System.out.println("The Factorial of 3 is: "+c.fact(3));
        System.out.println("The Factorial of 5 is: "+c.fact(5));
    }
}