import java.util.*;
public class merge {
    public static void main(String[]args){
        int[] arr = {1,5,8,2,6,9,56,78,40,8,7,9,0};
        int[] arr2 = {1,4,6,7,8,9,0};
        int n = arr.length;
        int m = arr2.length;
        int[] res = new int[m+n];
        for(int i=0;i<n;i++){
            res[i] = arr[i];
        }
        for(int j=0;j<m;j++){
            res[j+n] = arr[j];
        }
        System.out.println(Arrays.toString(res));

        int k = res.length;

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for(int num: res){
            if(num>l){
                sl = l;
                l = num;
            }
            else if(num>sl && num != l){
                sl = num;
            }
        }
        System.out.println(sl);
        System.out.println(l);
        
    }
}