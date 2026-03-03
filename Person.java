import java.util.Scanner;

class Persons {
    String name;
    int age;

    Persons(String x,int y){
        name = x;
        age =y;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

class Student extends Persons{
    int rno;
    Student(String x,int y,int z){
        super(x,y);
        rno = z;
    }
    void display(){
        super.display();
        System.out.println("Roll No : "+rno);
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age,rno;
        System.out.println("Enter the name,age,rno : ");
        name = sc.next();
        age = sc.nextInt();
        rno = sc.nextInt();
        Student s1 = new Student(name,age,rno);
        s1.display();
        sc.close();
    }
}
