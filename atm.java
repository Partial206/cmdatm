import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = 0;
        int wh = 0;
        while(wh < 5){
         System.out.println(" 1 : Withdraw / 2 : Deposit / 3 : Money");
         int process = scan.nextInt();
         wh++;
         switch(process){
            case 1:
             System.out.println("How many?");
             int withdraw = scan.nextInt();
             if(money >= 1){
                money -= withdraw;
             }
             if(money < 1){
                System.out.println("You cant withdraw money");;
             }
             break;
            case 2:
             System.out.println("How many?");
             int deposit = scan.nextInt();
             money += deposit;
             break;
            case 3:
             System.out.println("Your money:" + money);
             break;
        }
        
    }
  }
}
