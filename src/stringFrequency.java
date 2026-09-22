import java.util.*;
import java.util.HashMap;

public class stringFrequency {
    public static void main(String[] args){

        String str = "Programming";

        HashMap<Character, Integer> freq = new HashMap<>();

        for(int i=0; i<str.length();i++){

            char ch = str.charAt(i);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);


        
    }
}
