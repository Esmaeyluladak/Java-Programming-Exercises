public class Soru12 {
    public static void main(String[] args) {
    int i,j;

    for(i=3; i<1000; i++){
        int bolenSayac = 0;

        for(j=2; j<i; j++){
            if(i%j==0) {
                bolenSayac++;
                break;
            }
        }
        if(bolenSayac==0){
            System.out.print(i + " - ");
         }
       }
    }
}
