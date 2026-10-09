import java.util.*;

public class transfromarray {
    public static void main(String[] args){
        int [] arr= {11,22,66,77,99};
        int n = arr.length;

        int[] temp = new int[arr.length];

        for(int i=0;i<n;i++){

            if(arr[i] == 11){
                arr[i] = 10;
            }
            else {

            int num = arr[i];

            int digit = num%10;

            int digit2 = num/10;

            arr[i] = digit2*100 + digit;
            }    


        }
        System.out.print(Arrays.toString(arr));
    }
}
