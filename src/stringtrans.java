public class stringtrans {
    public static void main(String[] krapal){
        int n = 1456789;

        String str = String.valueOf(n);

        String[] words = {"Zero", "one", "Two","Three", "Four","Five","Six","Seven","Eight","Nine"};

        for(int i=0;i<str.length();i++){
            int digit = str.charAt(i) - '0';
            System.out.print(words[digit]+ " ");
        }
    }
}
