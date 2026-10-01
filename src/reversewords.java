public class reversewords {
    public static void main(String[] args){
        String str = "Welcome to Java";

        String[] arr = str.split(" ");

        String rev = "";

        for(String num : arr){
            int n = num.length();
            String temp = "";
            for(int i=num.length()-1;i>=0;i--){
                temp = temp+ num.charAt(i);
            }
            rev = rev + temp+ " ";
        }
        System.out.println(rev);
    }
}
