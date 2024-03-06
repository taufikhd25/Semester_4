public class SegitigaSamaSisi extends Segitiga {
    public SegitigaSamaSisi(double alas, double tinggi) {
        super(alas, tinggi);
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}