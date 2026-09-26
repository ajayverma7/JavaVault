import java.util.*;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        if(m != n){
            return false;
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return (Arrays.equals(ch1, ch2));
    } 
    public static void main(String[] args){
        String s1 ="listen";
        String s2 = "sileet";
        boolean result = isAnagram(s1, s2);
        System.out.println(result);
    }
    
}
