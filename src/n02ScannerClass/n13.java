package n02ScannerClass;

import java.util.Scanner;

public class n13 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);
        System.out.println("iki tam sayi girniz :");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int hipotenus;
        hipotenus = ((sayi1*sayi1)+(sayi2*sayi2));

        System.out.println(hipotenus);

    }
}
