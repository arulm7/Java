import java.util.Scanner;

public class Fact {
    public static void main(String args[]){
        int n,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of "+n+" is :"+fact);
    }
}
