import java.util.HashMap;

public class mapfreq {
    public static void main(String[] args){

        String str = "Programming";

        HashMap<Character, Integer> map = new HashMap <>();

        for(int i=0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);

        


    }
}
