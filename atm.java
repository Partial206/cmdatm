import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double money = 0;
        int wh = 0;
        double total = 0;
        double[] board = {1000.1,2000.2,3000.3,4000.4,5000.5,money};
        double max = board[0];
        while(wh < 50){
         System.out.println(" 1 : Withdraw / 2 : Deposit / 3 : Money / 4: Moneyboard / 5: Total Money");
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
             deposit +=money;
             break;

            case 3:
             System.out.println("Your money:" + money);
             break;

            case 4:
            for(double number:board){
               if(max < number){
                  max = number;
               }
            }
            System.out.println("Most money in the Bank :" + max);
            break;

            case 5:
             for(double numberr:board){
               total = numberr + total;
             }
            System.out.println("Total money in the Bank :" + total);
            break; 
        }        
    }
  }
}

