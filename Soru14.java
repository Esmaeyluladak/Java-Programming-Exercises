import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {
    int boyut,toplam;
    float ort;

    Scanner scan = new Scanner (System.in);

        System.out.println("Dizinin boyutunu giriniz : ");
        boyut = scan.nextInt();

        int[] dizi =  new int[boyut];
        toplam = 0;
        for( int i = 0;  i<boyut ; i++){
            System.out.print(i + " . eleman = ");
            dizi[i] = scan.nextInt();
            toplam += dizi[i];
        }
        ort = toplam / boyut;
        System.out.println("Toplam = " + toplam);
        System.out.println("Ortalama = " + ort);
    }
}
