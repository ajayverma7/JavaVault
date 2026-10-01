public class pattern7 {
    public static void main(String[] args){
        //abcd pattern
        // a
        // a b
        // a b c
        // a b c d
        // a b c d e

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+96)+ " ");
            }
            System.out.println();
        }


    }
}
