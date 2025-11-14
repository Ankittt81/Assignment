package Matrix;

public class MedianinarowwisesortedMatrix {
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int ele=(n*m+1)/2;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][m-1]);
        }
        while(low<high){
            int mid=(low+high)/2;
            int count=traverse(mat,mid,m,n);
            if(count>=ele) high=mid;
            else low=mid+1;
        }
        return low;
    }
    int traverse(int[][] mat,int mid,int m,int n){
        int count=0;
        int i=0;
        while(i<n){
            if(mat[i][m-1]<=mid){
                count+=m;
            }
            else{
                int j=m-1;
                while(j>=0 && mat[i][j]>mid) j--;
                count=count+(j+1);
            }
            i++;
        }
        return count;
    }
}
