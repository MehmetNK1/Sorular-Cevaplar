package n02ScannerClass;

import java.util.Scanner;

public class n04 {
    public static void main(String[] args) {
     //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        //prizmanin hacmini hesaplayip yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Prizmanin uzun kenarini giriniz : ");
        int uzun = scan.nextInt();
        System.out.print("Prizmanin kisa kenarini giriniz : ");
        int kisa = scan.nextInt();
        System.out.print("Prizmanin yuksekligini giriniz : ");
        int yuksekligini = scan.nextInt();
        int hacim = (uzun*kisa*yuksekligini);
        System.out.print("Prizmanin hacmi : "+hacim);
    }
}
