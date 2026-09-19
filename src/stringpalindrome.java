// package src; 

import java.util.Scanner; 

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter String: "); 
        String str = sc.nextLine(); 
        
        // Remove spaces and convert to lowercase for accurate palindrome checking
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the string
        String reverse = "";
        for (int i = cleanStr.length() - 1; i >= 0; i--) {
            reverse += cleanStr.charAt(i);
        }
        
        // Compare the original cleaned string with the reversed string
        if (cleanStr.equals(reverse)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
        
        sc.close();
    }
}
