import java.util.*;

public class stringrev {
    public static void main(String[] args){
        String s1 = "Naman";
        char[] ch = s1.toCharArray();

        int n = ch.length;

        int left = 0;
        int right = n-1;

        while(right>left){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        String s2 = new String(ch);

        System.out.println("Reversed String is: "+ s2);

        if(s1.equals(s2)){
            System.out.println("String is Palidrome.");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
    
}
