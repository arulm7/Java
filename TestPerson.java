import java.util.Scanner;
class Person{
    int age;
    String name;
    Person(int age,String name){
        this.age = age;
        this.name = name;
    }
    
}
class Student extends Person{
    int rno;
    Student(int a,int rno,String name){
        super(a, name);
        this.rno = rno;
    }
    void display(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Roll No"+rno);
    }
}
class TestPerson{
    public static void main(String[] args){
        int a,b;
        String n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        n = sc.nextLine();
        System.out.println("Enter the age : ");
        a = sc.nextInt();
        System.out.println("Enter the roll no :");
        b = sc.nextInt();
        sc.close();
        Student s = new Student(a, b, n);
        s.display();
    }
}