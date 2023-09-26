import java.util.Scanner;

public class atmcmd {
    static int para = 0;
    
    public static void paracek(int cekilenpara){
        System.out.println("Kaç para çekeceksin?");
        Scanner scan = new Scanner(System.in);
        cekilenpara = scan.nextInt();

        para -= cekilenpara;

        System.out.println(cekilenpara);
        System.out.println("Başarılı bir şekilde paranız çekildi iyi günler!");
    }

    public static void parayatir(int yatırılanpara){
        System.out.println("Kaç para yatıracaksın?");
        Scanner scan = new Scanner(System.in);
        yatırılanpara = scan.nextInt();

        para += yatırılanpara;

        System.out.println(yatırılanpara);
        System.out.println("Başarılı bir şekilde paranız yatırıldı iyi günler!");
    }
    
    public static void main(String[] args) {
        for(int i = 0; i < 50; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("1- Para Yatır, 2- Para Çek, 3- Paranı Gör");
            int process = scan.nextInt();
            switch(process){
                case 1:
                    parayatir(0);
                    break;
                case 2:
                    paracek(0);
                    break;
                case 3:
                    System.out.println("Mevcut Paran:");
                    System.out.println(para);
                    break;
            }
        }
    }   
}
