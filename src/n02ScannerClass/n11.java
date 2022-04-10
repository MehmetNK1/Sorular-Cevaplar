package n02ScannerClass;

import java.util.Scanner;

public class n11 {
    // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("2 tam sayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplama;
        int carpma;
        int cikartma;
        int bolme;
        toplama = (sayi1+sayi2);
        carpma = (sayi1*sayi2);
        cikartma = (sayi1-sayi2);
        bolme = (sayi1/sayi2);
        System.out.println("toplama : "+toplama);
        System.out.println("carpma : "+carpma);
        System.out.println("cikartma : "+cikartma);
        System.out.println("bolme : "+bolme);
    }
}
