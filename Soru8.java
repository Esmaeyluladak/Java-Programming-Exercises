import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args){
     int i,n,m;
     Scanner scan = new Scanner(System.in);

     System.out.println("Başlangıç sayısı : ");
     n = scan.nextInt();

     System.out.println("Bitiş sayısı : ");
     m = scan.nextInt();

        System.out.print(+n + " - " +m + " arasında olan sayılar \n" );
     for(i=n; i<m ; i++){
         if(i%7==0) System.out.print(i + " " + "\n");
       }
    }
}
