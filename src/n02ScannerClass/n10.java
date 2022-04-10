package n02ScannerClass;

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamakli bir sayi girniz : ");
        int sayi = scan.nextInt();
        int birler = 0;
        int onlar = 0;
        int yuzler = 0;
        birler= sayi%10;
        sayi/=10;
        onlar= sayi%10;
        sayi/=10;
       yuzler= sayi%10;
       sayi/=10;
        System.out.println("Girdiginiz sayinin birler basamagi : "+birler);
        System.out.println("Girdiginiz sayinin onlar basamagi : "+onlar);
        System.out.println("Girdiginiz sayinin yuzler basamagi : "+yuzler);
    }
}
