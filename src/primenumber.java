public class primenumber {

    static boolean isPrime(int n){
        boolean ip = true;

        if(n<=1){
            ip = false;
        }

        for(int i=2;i<n;i++){
            if(n%i == 0){
                ip = false;
                break;
            }
        }
        if(ip){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int n = 12;

        System.out.println(isPrime(n));
    }
    
}
