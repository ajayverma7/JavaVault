import java.util.*;

public class removedup {

    HashSet<Integer> removedup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for( int num : arr){
            set.add(num);
        }
        return set;
    }

    public static void main(String [] arsg){
        int arr[] = {1,2,3,55,5,6,6,7,8,8,9,9,9,0};

        System.out.println(Arrays.toString(arr));
        removedup ar1 = new removedup();
        System.out.println(ar1.removedup(arr));
    }
}
