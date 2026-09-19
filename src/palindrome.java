// package src;

import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // for user imput 

        System.out.println("Enter a number to Check Palindrome:");
        int original = sc.nextInt();
        int number = original; // we will perform action on number 
        
        // reversing a number
        int reversed = 0;
        while(number>0){
            int digit = number%10;
            reversed = reversed*10 + digit;
            number = number/10;
        }

        // checking original == reversed or not
        if(original == reversed){
            System.out.println("Entered Number is palinderome.");
        }
        else{
            System.out.println("Entered Number is not Palindrome.");
        }
    }

    
    
}
