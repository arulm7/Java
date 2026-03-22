import java.util.Scanner; 
public class Ballooncapacity {
    public static void main(String[] args){
        //input is like n persons and n[i] is weight of persons we need to assending order of weights and x is capacity of balloon and it should give maximum members can enter the baloon
        int n,x,i;
        int[] w = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons : ");
        n = sc.nextInt();
        System.out.println("Enter the weights of persons : ");
        for(i=0;i<n;i++){
            w[i] = sc.nextInt();
        }
        System.out.println("Enter the capacity of balloon : ");
        x = sc.nextInt();
        sc.close();
        int count = 0;
        int sum = 0;
        // Sort the weights in ascending order
        for(i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(w[j] > w[j+1]){
                    int temp = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp;
                }
            }
        }
        // Calculate the maximum members that can enter the balloon
        for(i=0;i<n;i++){
            if(sum + w[i] <= x){
                sum += w[i];
                count++;
            } else {
                break;
            }
        }
        System.out.println("Maximum members that can enter the balloon: " + count);

    }
}
