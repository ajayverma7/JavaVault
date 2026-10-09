import java.util.*;

public class twodarr {
    public static void main(String[] kappu){
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int n = mat.length;
        int m = mat[0].length;
        int sum = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum = sum + mat[i][j];
            }
        }

        System.out.println(sum);
    }
}
