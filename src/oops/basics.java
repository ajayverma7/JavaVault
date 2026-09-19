package oops;

class Student{
    String name;
    int id;
    int age;
    int marks;
    void printname(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.marks);

    }

}

public class basics{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ajay";
        s1.age = 20;
        s1.id = 100243;
        s1.marks = 98;
        s1.printname();

    }
}
