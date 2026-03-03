public class arac {
    String model;
    String marka;

    public arac(String model , String marka ){
        this.model=model;
        this.marka=marka;
    }
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
    }
}

