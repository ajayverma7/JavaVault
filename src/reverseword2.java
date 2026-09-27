public class reverseword2 {
    public static void main(String[] args){
        String sent = "Welcome to Java";
        String[] words = sent.split(" ");
        String rev = "";
        for(String w : words){
            StringBuilder sb = new StringBuilder(w).reverse();
            rev = rev + sb.toString() + " "; 
        }
        System.out.println(rev.trim());
    }
}
