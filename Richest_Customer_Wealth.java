class Solution {
    public int maximumWealth(int[][] acc) {
        int b=0;
        for(int i=0;i<acc.length;i++){
             int m=0;
        for(int j=0;j<acc[0].length;j++){
             m=m+acc[i][j];
        }
        if(b<m){
            b=m;
        }
        }
        return (b);
    }
}