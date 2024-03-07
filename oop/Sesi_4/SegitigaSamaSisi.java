public class SegitigaSamaSisi extends Segitiga{
    protected double sisi;

    public SegitigaSamaSisi(String name, double sisi) {
        super.setNama(name);
        
        this.sisi = sisi;


        hitungLuas(this.sisi);
        hitungKeliling(this.sisi);

    }

    public void getInfo() {
        System.out.println("Jenis: Segitiga Sama Sisi");
        super.getInfo();
    }

    @Override
    public void hitungLuas() {
        double s = (this.sisi + this.sisi + this.sisi) / 2; 
        super.luas = Math.round(Math.sqrt(s * (s - this.sisi) * (s - this.sisi) * (s - this.sisi)));
    }

    public void hitungLuas(double sisi) {
        double semiPerimeter = (sisi + sisi + sisi) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - sisi) * (semiPerimeter - sisi) * (semiPerimeter - sisi)) * 100.0) / 100.0;
    }

    @Override
    public void hitungKeliling() {
        super.keliling = this.sisi + this.sisi + this.sisi;
    }

    public void hitungKeliling(double sisi) {
        super.keliling = sisi + sisi + sisi;
    }

}