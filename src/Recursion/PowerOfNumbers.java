package Recursion;

public class PowerOfNumbers {
    public int reverseExponentiation(int n) {
        // code here
        int num=reverse(n,0);
        return power(n,num);
    }
    int power(int a,int b){
        if(b==0) return 1;

        return a*power(a,b-1);
    }
    int reverse(int n,int rev){
        if(n==0) return rev;

        return reverse(n/10,rev*10+n%10);
    }
}
