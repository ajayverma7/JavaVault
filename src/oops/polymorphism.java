package oops;
// polymorphism compile time achieving method overloading
class Maths{
    int TwoSum(int x, int y){
        return x+y;
    }
    double TwoSum(double x, double y){
        return (double)x+y;
    }
}
class Math2 extends Maths{
    @Override
    double TwoSum(double x, double y){
        return x*y;
    }
}
public class polymorphism {
    public static void main(String[] args){
        Maths p1 = new Maths();
        Math2 p2 = new Math2();
        System.out.println(p1.TwoSum(2, 3));
        System.out.println(p1.TwoSum(2.4, 4.5));    
        System.out.println(p2.TwoSum(2.4, 4.5));
    }
    
}
