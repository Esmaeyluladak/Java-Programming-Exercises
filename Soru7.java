import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args){
        int i,toplam,n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        n = scan.nextInt();

        toplam = 0;

        for(i=1; i<n; i++){
        if(i%2==1) toplam += i;
        }
        System.out.println("1 - " +n +" arası tek sayılar toplamı =" +toplam);
    }
}
