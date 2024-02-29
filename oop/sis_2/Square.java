public class Square {
    private double luas;
    private double keliling;
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
    }

    public double getLuas() {
        return luas;
    }

    public void hitungKeliling() {
        keliling = 4 * sisi;
    }

    public double getKeliling() {
        return keliling;
    }
}