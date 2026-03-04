import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enteer a number to find the odd or even");
        n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println(n+" is an even number");
        }
        else{
            System.out.println(n+" is an odd number");
        }

    }
    
}
