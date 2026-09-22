public class secondlargest {
    public static void main(String []args){
        int[] arr = {1,4,56,78,9,0,4,7,89};

        int Second_Largest = Integer.MIN_VALUE;
        int Largest = Integer.MIN_VALUE;

        for(int num: arr){
            if(num> Largest){
                Second_Largest = Largest;
                Largest = num;
            }
            else if(num > Second_Largest && num != Largest){
                Second_Largest = num;
            }
        }
        // System.out.println(Largest);
        System.out.println(Second_Largest);


    }
    
}
