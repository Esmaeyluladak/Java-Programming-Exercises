import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        int tektoplam, cifttoplam, tekadet, ciftadet, i, sayi ;
        float tekortalama, ciftortalama;

        Scanner scan = new Scanner(System.in);

        tekadet = 0;
        ciftadet = 0;
        tektoplam = 0;
        cifttoplam = 0;

        for (i = 0; i < 10; i++) {
            System.out.println(i + ". sayı : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                ciftadet++ ;
                cifttoplam += sayi;
            } else if (sayi % 2 == 1) {
                tekadet++;
                tektoplam += sayi;
               }
            }
            System.out.println(ciftadet + " Çift sayının toplamı : " + cifttoplam);
            System.out.println(tekadet + " Tek sayının toplamı : " + tektoplam);

            ciftortalama = (float) cifttoplam / ciftadet;
            tekortalama = (float) tektoplam / tekadet;

        System.out.println("Çift sayıların ortalaması : " +ciftortalama);
        System.out.println("Tek sayıların ortalaması : " +tekortalama);
        }
    }
