public class soru3 {
    public static void main(String[] args){

        int baslangic = 0;
        int bitis = 50;

        System.out.println("For döngüsü ile 3'e bölünebilen sayılar :");
        for(int i = baslangic;  i<=bitis; i++){

            if(i % 3 == 0){
            System.out.print(i + ",");
            }
        }
    }
}
