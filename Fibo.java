import java.util.Scanner;
public class Fibo {
    public static void main(String args[]){
        int n1=0,n2=1,n3,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of terms : ");
        n = sc.nextInt();
        sc.close();
        //fibonacci series
        System.out.println("Fibonacci Series : ");
        for(i=1;i<=n;i++){
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
