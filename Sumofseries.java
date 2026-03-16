//sum of series
import java.util.*;

class Sumofseries{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter the n terms : ");
        n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + (i*i);
        }
        System.out.println("Sum of the series is : " + sum);
    }
}
//
//