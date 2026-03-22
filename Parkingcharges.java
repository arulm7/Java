import java.util.Scanner;
public class Parkingcharges {
    public static void main(String[] args) {
        // Parking charge calculation logic can be implemented here
        //first 2 hours: 100/hr
        //next 3 hours: 50/hr
        //beyond 5 hours: 20/hr
        int h;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        sc.close(); 
        int c = 0;
        if(h <= 2){
            c = h * 100;
        } else if(h <= 5){
            c = 2 * 100 + (h - 2) * 50;
        } else {
            c = 2 * 100 + 3 * 50 + (h - 5) * 20;
        }
        System.out.println("Parking Charge: " + c);

    }
}
