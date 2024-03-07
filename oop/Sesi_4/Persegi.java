public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(String name, double sisi) {
        super.setNama(name);
        this.sisi = sisi;

        hitungLuas(this.sisi);
        hitungKeliling(this.sisi);
    }

    public void getInfo() {
        System.out.println("Jenis: Persegi");
        super.getInfo();
    }

    public void hitungLuas() {
        super.luas = this.sisi * this.sisi;
    }

    public void hitungLuas(double sisi) {
        super.luas = sisi * sisi;
    }

    public void hitungKeliling() {
        super.keliling = this.sisi * 4;
    }

    public void hitungKeliling(double sisi) {
        super.keliling = sisi * 4;
    }
}
