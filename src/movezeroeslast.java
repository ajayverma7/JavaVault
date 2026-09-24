import java.util.*;

public class movezeroeslast {
    public static void main(String[]args){
        int[] arr = {1,2,0,6,7,0, 0, 0,89,0,3,0,6,7};

        int n = arr.length;

        int [] res = new int[n];
        int k = 0;

        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                res[k] = arr[i]; 
                k++;
            }
        }

        while(n>k){
            res[k] = 0;
            k++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
    }
    
}
