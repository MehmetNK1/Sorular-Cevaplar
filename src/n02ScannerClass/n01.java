package n02ScannerClass;

import java.util.Scanner;

public class n01 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz : ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplama = (sayi1+sayi2);
        int cikarma = (sayi1-sayi2);
        int carpma = (sayi1*sayi2);
        System.out.println("Toplama islemi : "+toplama);
        System.out.println("Cikarma islemi : "+cikarma);
        System.out.println("Carpma islemi : "+ carpma);
    }
}
