import java.util.Scanner;

class bank{
        String name;
        private int ano;
        bank(String name,int ano){
            this.name=name;
            this.ano=ano;
        }
        void display(){
            System.out.println("Acckholder name : "+name);
            System.out.println("Account number : "+ano);
        }

}
class saving extends bank{
    int b;
    saving(String name,int ano,int b){
        super(name,ano);
        this.b=b;
    }
    void display(){
        super.display();
        System.out.println("Balance : "+b);
    }
}

class deposit extends saving{
    int d;
    deposit(String name,int ano,int b,int d){
        super(name,ano,b);
        this.d=d;
    }
    
    void display(){
        super.display();
        System.out.println("Deposit Amount : "+d);
    }
}

class TestBank{
    public static void main(String[] args){
        String name;
        int ano,b,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter account number:");
        ano=sc.nextInt();
        System.out.println("Enter balance:");
        b=sc.nextInt();
        System.out.println("Enter deposit amount:");
        d=sc.nextInt();
        sc.close();
        deposit d1=new deposit(name,ano,b,d);
        d1.display();
    }
}
