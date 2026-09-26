import java.util.*;

public class intersect {
    public static void main(String [] args){
        int[] arr1 = {1,3,5,7,89,98,76,54,67,78};
        int[] arr2 = {78,98,5,7,0,45,101};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j]){
                    res.add(arr1[i]);
                }
            }
        }
        System.out.println(res);
    }
    
}
