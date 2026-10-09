public class matbound {
    public static void main(String [] args){
        int [][] mat = {{1,2,3,12},
                        {4,5,6,11},
                        {7,8,9,10}};

        int row = mat.length;
        int col = mat[0].length;
        
        for(int i=0;i<col;i++){
            System.out.print(mat[0][i] + " ");
        }

        for(int i=col-1;i>=0;i++){
            System.out.print(mat[1][i]);
        }

        for(int i = col-1;i>=0;i--){
            System.out.print(mat[2][i]+ " ");
        }
    }                    
}
