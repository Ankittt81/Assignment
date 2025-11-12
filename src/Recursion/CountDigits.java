package Recursion;

public class CountDigits {
    static int evenlyDivides(int n) {
        return digit(n,n);
    }
    static int digit(int n,int num){
        if(n==0) return 0;
        int rem=n%10;
        if(rem!=0 && num%rem==0) return 1+digit(n/10,num);
        return  digit(n/10,num);
    }
}
