public class reverseword2 {
    public static void main(String[] args){
        String name = "Welcome to Java";

        String rev = "";

        String[] arr = name.split("\\s+");

        for(String num:arr){
            StringBuilder temp = new StringBuilder(num).reverse();
            rev = rev + temp.toString()+ " ";
        }
        System.out.println(rev);
        
    }
}
