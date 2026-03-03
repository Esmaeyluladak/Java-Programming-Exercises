import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {
    String yazi;

    Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        yazi = scan.nextLine();

        System.out.println("Harf sayısı : " + yazi.length());
        int sayac = 0;

        for(int i=0; i<yazi.length(); i++){
            if(yazi.charAt(i)==' ' ) sayac++;
        }
        System.out.println("Kelime sayısı = " +(sayac + 1));
    }
}
