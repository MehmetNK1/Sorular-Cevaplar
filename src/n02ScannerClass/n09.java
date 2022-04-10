package n02ScannerClass;

import java.util.Scanner;

public class n09 {
    public static void main(String[] args) {
        /*
         * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("adinizi giriniz : ");
        String ad = scan.next();
        System.out.print("soyadinizi giriniz : ");
        String soyad = scan.next();
        System.out.print("yasinizi giriniz : ");
        int yas = scan.nextInt();
        System.out.print("boyunuzu giriniz : ");
        int boy = scan.nextInt();

    }
}
