package Recursion;

public class TowerOfHanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {

        if(n==0) return 0;
        int move=0;

        move+=towerOfHanoi(n-1,from,aux,to);
        move+=1;
        move+=towerOfHanoi(n-1,aux,to,from);
        return move;
    }
}
