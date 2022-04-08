package n02ScannerClass;

import java.util.Scanner;

public class n05 {
    public static void main(String[] args) {
        /*Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

        Isminiz : Mehmet
        Soyisminiz : Bulut
        Kursumuza katiliminiz alinmistir,tesekkur ederiz*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Isminizi giriniz : ");
        String isminiz = scan.next();
        System.out.print("Soyisminizi giriniz : ");
        String soyisim = scan.next();
        System.out.println("isminiz : "+isminiz);
        System.out.println("Soyadiniz : "+soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
    }
}
