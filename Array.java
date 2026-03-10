import java.util.Scanner;
public class Array {
    public static void main(String args[]){
        int a[] = new int[10],i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        n =sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter the element "+(i+1)+" : ");
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();

    }
    
}
