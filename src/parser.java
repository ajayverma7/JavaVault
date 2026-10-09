public class parser {
    public static void main(String[] args){
    
        String str = "1rupee";

        String [] part = str.split("\\s+");

        int integercount = 0;

        int Stringcount = 0;

        int doublecount = 0;

        if(str.trim().isEmpty()){
            System.out.println("String is Empty.");
            return;
        }

        for(String temp : part){

            if(temp.matches("[0-9]+")){
                integercount++;
            }
            else if(temp.matches("[0-9]+\\.[0-9]+")){
                doublecount++;
            }
            else{
                Stringcount++;
            }

        }
        System.out.println("Integer is: "+integercount);
        System.out.println("Double count is: "+doublecount);
        System.out.println("String coiunt is: "+Stringcount);
    }
    
}
