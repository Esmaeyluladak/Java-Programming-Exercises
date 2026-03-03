class araba extends arac{
    int kapiSayisi;
    public araba(String marka, String model, int kapiSayisi) {
        super(marka, model);
        this.kapiSayisi = kapiSayisi;
    }
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kapı Sayısı: " + kapiSayisi);
    }
}
