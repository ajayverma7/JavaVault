public class swapvar {
    public static void main(String[] args){
        int a = 10;
        int b = 20;


        //Method 1 using temp variable
        // int temp = a;
        // a = b;
        // b = temp;

        //method 2 using arithmetic operations
        // a = a +b;
        // b = a-b;
        // a = a-b;

        //method 3 using exor
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
