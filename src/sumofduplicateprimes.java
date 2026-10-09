import java.util.*;

import java.util.HashSet;

public class sumofduplicateprimes {

    public static boolean isp(int n){
        if(n <=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            } 
        }
        return true;
        
    }
    public static void main(String[] args){

        int []arr = {1,2,3,3,5,65,5,7,8,90,0};
        int n =arr.length;
        int [] temp = new int[n];
        int c = 0;

        for(int num : arr){
            boolean isprime = isp(num);
            if(isprime){
                temp[c] = num;
                c++;
            }
        }    
        int[] primes = new int[c];

        for(int i=0;i<c;i++){
            primes[i] = temp[i];
        }
        System.out.println(Arrays.toString(primes));

        int tsum = 0;

        for(int i=0;i<c;i++){
            for(int j=i;j<c;j++){
                if(primes[i] == primes[j]){
                    tsum = tsum+primes[j];
                }
            }
        }
        System.out.println(tsum);

        
    }
}
