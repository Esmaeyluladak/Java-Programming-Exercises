class bankaHesabi {
    private double bakiye;

    public void paraYatir(double miktar) {
        if (miktar > 0) bakiye += miktar;
    }

    public void paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
        } else {
            System.out.println("Yetersiz Bakiye!");
        }
    }

    public double getBakiye() {
        return bakiye;
        }
}
