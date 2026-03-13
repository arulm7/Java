import java.util.*;
class Sumofdigits{
    void main(){
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        sc.close();
        while(n>0){
            s =s+n%10;
            n/=10;
        }
        System.out.println("Sum of digits: " + s);
    }
}