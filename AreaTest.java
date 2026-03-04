import java.util.Scanner;

class Area {
    void area(int a){
        System.out.println("Area of square : "+a*a);
    }
    void area(int l,int b){
        System.out.println("Area of rectangle : "+l*b);
    }
    void area(double r){
        System.out.println("Area of circle :"+3.14*r*r);
    }
    
}
//Method overloading - same method name with different parameters

class AreaTest{
    public static void main(String[] args){
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int s = sc.nextInt();
        System.out.print("Enter the length and breadth of rectangle : ");
        int l,b;
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter the radius of circle : ");
        double r = sc.nextDouble();
        sc.close();
        a.area(s);
        a.area(l,b);
        a.area(r);
    }
}


