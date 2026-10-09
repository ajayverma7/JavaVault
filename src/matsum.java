import java.util.*;

public class matsum {
    public static void main(String[] args){
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};
       
        int n = mat1.length;
        int m = mat1[0].length;
        int[][] sum = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j] = mat1[i][j] + mat2[i][i]; 
            }
        }
        System.out.println(Arrays.deepToString(sum));
    }
}
