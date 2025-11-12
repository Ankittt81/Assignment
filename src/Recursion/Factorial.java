package Recursion;

public class Factorial {
    int factorial(int n) {
        // code here
        if(n==1) return 1;
        return factorial(n-1)*n;
    }
}
