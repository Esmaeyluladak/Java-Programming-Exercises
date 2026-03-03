import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
   String isim;
   int sesli = 0;

   Scanner scan = new Scanner(System.in);
   System.out.println("İsminiz : ");
   isim = scan.nextLine();

   for(int i=0; i<isim.length(); i++){
       char c = isim.charAt(i);
       if(c=='a' || c=='e' || c=='i' || c=='ı' || c=='u' || c=='ü' || c=='o' || c=='ö'){
           sesli++;
         }
       }
        System.out.println("Sesli sayısı : " +sesli);
        System.out.println("Sessiz sayısı : " +(isim.length()-sesli));
    }
}
