package n02ScannerClass;

import java.util.Scanner;

public class n02 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip
        //yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Karenin bir kenar uzunlugunu giriniz : ");
        int kare =scan.nextInt();
        int cevre = (kare*4);
        int alan = (kare*kare);
        System.out.println("Karenin cevresi :"+cevre);
        System.out.print("Karenin alani : "+ alan);
    }
}
