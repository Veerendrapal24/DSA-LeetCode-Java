import java.util.*;
class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int[][] arr = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            arr[i] = mat[i].clone();
        }
        for(int j=0;j<k;j++){
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    getl(i,mat);
                }
                else{
                    getr(i,mat);
                }
            }
        }
        return Arrays.deepEquals(arr,mat);
    }
    static void getl(int r,int [][] mat){
        int z=mat[r][0];
        for(int j=0;j<mat[0].length-1;j++){
            mat[r][j]=mat[r][j+1];
        }
        mat[r][mat[0].length-1]=z;
    }
    static void getr(int r, int[][]mat){
        int z=mat[r][mat[0].length-1];
        for(int j=mat[0].length-1;j>0;j--){
            mat[r][j]=mat[r][j-1];
        }
        mat[r][0]=z;
    }
}