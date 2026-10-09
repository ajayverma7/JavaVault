import java.util.HashMap;

public class timepss {
    public void main(String[] args){
        String str = "aabbcc";

        HashMap<Character, Integer> map = new HashMap<>();

        int n = str.length();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char ch:map.keySet()){
            sb.append(ch).append(map.get(ch));
        }
        System.out.println(sb);
    }

    
}
