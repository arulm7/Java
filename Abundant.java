import java.util.Scanner;

public class Abundant {
    public static void main(String[] args){
        int n,i,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        sc.close();
        s = 0;
        for(i=1;i<n;i++){
            if(n%i==0){
                s = s+i;
            }
        }
        if(s>n){
            System.out.println("It is an abundant number");
        }
        else{
            System.out.println("It is not an abundant number");
        }
    }
}
