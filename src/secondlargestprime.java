import java.util.*;

public class secondlargestprime {
    public static void main(String []timepass){
        int [] arr = {1,2,3,5,67,8,9,0,11,56};

        int[] temp = new int[arr.length];
        int c = 0;

        for(int i=0;i<arr.length;i++){
            int check = arr[i];

            boolean isprime = true;

            if(check<=1){
                isprime = false;
            }
            for(int j=2;j<check;j++){
                if(check%j == 0){
                    isprime = false;
                }

            }
            if(isprime){
                temp[c] = check; 
                c++; 
            }
            
        }
        System.out.println(Arrays.toString(temp));

        int sl = Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;

        for(int num: temp){
            if(num > l){
                sl = l;
                l = num;
            }
            else if(num > sl && num != l){
                sl = num;
            }
        }
        System.out.println(l);
        System.out.println(sl);
    }
}
