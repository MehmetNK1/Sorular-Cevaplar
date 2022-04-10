package n02ScannerClass;

import java.util.Scanner;

public class n07 {
    public static void main(String[] args) {
       //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        char ilkHarf=scan.next().charAt(0);
        System.out.println(ilkHarf);
    }
}
