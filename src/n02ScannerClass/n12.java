package n02ScannerClass;

import java.util.Scanner;

public class n12 {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("5 basmakli bir sayi giriniz : ");
        int sayi = scan.nextInt();
        int depo1;
        int depo2;
        int toplam;
        depo2 = sayi%10;
        sayi/=10;
        toplam = depo2;
        depo2 = sayi%10;
        sayi/=10;
        toplam+=depo2;
        depo1=sayi%10;
        sayi/=10;
        depo1=sayi%10;
        sayi/=10;
        toplam+=depo1;
        depo1 = sayi%10;
        sayi/=10;
        toplam+=depo1;
        System.out.println(toplam);



    }
}
