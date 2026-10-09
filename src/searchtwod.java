public class searchtwod {
    public static void main(String [] ajay){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int n = mat.length;
        int m = mat[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 7){
                    System.out.println("Found at row: "+i+" and column: "+ j);
                }
            }
        }
    }
}