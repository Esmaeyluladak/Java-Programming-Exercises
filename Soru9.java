import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args){
    String isim;
    Scanner scan = new Scanner(System.in);

    System.out.println("Lütfen bir kelime giriniz : ");
    isim = scan.nextLine();

    int i;
    for(i=isim.length()-1; i>=0; i--){
        System.out.println(isim.charAt(i));
       }
    }
}
