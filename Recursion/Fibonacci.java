package Recursion;

public class Fibonacci {
    public static void printFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(c);
        printFibonacci(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a);
        System.out.print(b);
        int n = 7;
        printFibonacci(a, b, n-2);
    }
}
