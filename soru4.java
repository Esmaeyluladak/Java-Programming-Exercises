public class soru4 {
    public static void main(String[] args) {
        String metin = "Programlama";
        int sayac = 0;
        String sesliler = "aeıioöuüAEIİOÖUÜ"; // Kontrol stringi

        for (int i = 0; i < metin.length(); i++) {
            // Karakterin sesliler stringinde olup olmadığına bakıyoruz
            if (sesliler.indexOf(metin.charAt(i)) != -1) {
                sayac++;
            }
        }
        System.out.println("Sesli harf sayısı: " +sayac);
    }
}
