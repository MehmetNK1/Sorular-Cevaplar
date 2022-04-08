package n02ScannerClass;

import java.util.Scanner;

public class n03 {
    public static void main(String[] args) {
      //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini (2*pi*r)
        // ve dairenin alanini(pi*r^2) hesaplayip yazdirin (pi:3.14)
        Scanner scan = new Scanner(System.in);
        System.out.print("Cemberin yari capini giriniz : ");
        int yaricap = scan.nextInt();
        double cevre = (2*3.14*yaricap);
        double alan = (3.14*(yaricap*yaricap));
        System.out.println("Cemberin Cevresi : "+cevre);
        System.out.println("Cemberin Alani : "+alan );

    }
}
