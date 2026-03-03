import java.util.Scanner;

public class soru2ekrandanciktial {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu girin: ");
        int not = scan.nextInt();

        if(not>=90){
            System.out.println("AA");
        }
        else if (not>=80) {
            System.out.println("BB");
        }
        else if (not>=50) {
            System.out.println("CC");
        }
        else if (not>=0) {
            System.out.println("FF");
        }
        else {
            System.out.println("Hatalı giriş.");
        }
    }
}
