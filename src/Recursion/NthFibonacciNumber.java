package Recursion;

public class NthFibonacciNumber {
    public int nthFibonacci(int n) {

        if(n==0 || n==1) return n;
        return nthFibonacci(n-2)+nthFibonacci(n-1);
    }
}
