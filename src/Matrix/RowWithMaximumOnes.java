package Matrix;

public class RowWithMaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int idx=0;
        int maxcount=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1) count++;
            }
            if(count>maxcount){
                idx=i;
                maxcount=count;
            }
        }

        return new int[]{idx,maxcount};
    }
}
