package src;
import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of terms: ");
        int n = sc.nextInt();

        int x = 0;
        int y = 1;

        for(int i=1;i<=n;i++){
            int z= x+y;
            System.out.print(x+" ");
            x = y;
            y = z;
        }
    }
}
