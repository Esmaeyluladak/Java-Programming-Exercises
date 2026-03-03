import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        int sayi , br , on , yz , bn ;
        char c;

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı sayı giriniz: ");
        sayi = scan.nextInt();

        c = Integer.toString(sayi).charAt(0);
        bn = Integer.parseInt(Character.toString(c));
        System.out.println(bn);

        c = Integer.toString(sayi).charAt(1);
        yz = Integer.parseInt(Character.toString(c));
        System.out.println(yz);

        c = Integer.toString(sayi).charAt(2);
        on = Integer.parseInt(Character.toString(c));
        System.out.println(on);

        c = Integer.toString(sayi).charAt(3);
        br = Integer.parseInt(Character.toString(c));
        System.out.println(br);
    }
}
