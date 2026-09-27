public class reversewords {
    public static void main(String[] args){
        String str  = "Welcome to Java";

        String[] words = str.split(" ");

        String rev = "";

        for(int i=0;i<words.length;i++){
            String temp = words[i];
            String reverseword = "";
            for(int j=temp.length()-1;j>=0;j--){
                reverseword +=temp.charAt(j);
            }
            rev = rev + reverseword + " ";
        }
        System.out.println(rev);
    }
}
