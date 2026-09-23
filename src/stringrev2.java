public class stringrev2 {
    public static void main(String []args){
        String s1 = "namAMM";
        StringBuilder rev = new StringBuilder(s1).reverse();

        String s2 = rev.toString();

        if(s1.equals(s2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        } 
    }
    
}
