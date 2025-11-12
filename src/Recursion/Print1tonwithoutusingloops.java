package Recursion;

public class Print1tonwithoutusingloops {
    static void printTillN(int N) {
        // code here
        if(N==0) return;
        printTillN(N-1);
        System.out.print(N+" ");
    }
}
