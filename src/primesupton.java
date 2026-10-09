import java.util.*;

public class primesupton {
    static ArrayList<Integer> primenums(int n){

        ArrayList<Integer> temp = new ArrayList <>();
        for(int i=0;i<=n;i++){
            boolean isprime = true;
            
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                temp.add(i);
            }
        }
        return temp;
    }

    public static void main(String[] args){
        ArrayList<Integer> result = primenums(20);

        System.out.println(result);
    }
}
