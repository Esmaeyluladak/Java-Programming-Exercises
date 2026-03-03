public class soru5 {
    public static void main(String[] args) {
        int sonuc = usAl(2, 3);
        System.out.println("Sonuç: " + sonuc);
    }

    public static int usAl(int taban, int us) {
        int carpim = 1;
        for (int i = 0; i < us; i++) {
            carpim *= taban;
        }
        return carpim;
    }
}
