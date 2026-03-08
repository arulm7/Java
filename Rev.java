import java.util.Scanner;
public class Rev {
    public static void main(String args[]){
        int n,rev=0,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n =  sc.nextInt();
        sc.close();
        while(n>0){
            s = n %10;
            rev = rev * 10 +s;
            n = n/10;
        }
        System.out.println("The reverse of the number is : "+rev);
        if(rev == n){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("It is not a palindrome number");    
        }
    }
}
