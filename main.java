import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        int transport = 123000;
        int tabung = 100000;
        float budget_makan;
        Scanner s = new Scanner(System.in);
        System.out.print("masukan jumlah pemasukan minggu ini: ");
        int a = s.nextInt();
        if(a <= 200000){
            tabung = 50000;
        }
         a -= transport;
         a-= tabung;
         budget_makan = a/21;
         System.out.println("budget sekali makan: " + budget_makan);



    }
}
