public class armstrong {
    public static void main(String[] args){
        int n = 2;
        int temp = n;
        int count = 0;
        while(temp>0){
            count++;
            temp = temp/10;
        }
        System.out.println(count);
        int arm = n;
        int sum = 0;
        while(arm>0){
            int digit = arm%10;
            sum = sum + (int)Math.pow(digit, count);
            arm = arm/10;
        }
        if(n == sum){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
