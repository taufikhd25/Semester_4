public class SegitigaSamaKaki extends Segitiga {
    protected double alas;
    protected double sisi;
    
    public SegitigaSamaKaki(String name, double alas, double sisi) {
        super.setNama(name);
        this.alas = alas;
        this.sisi = sisi;


        hitungKeliling(this.alas, this.sisi);
        hitungLuas(this.alas, this.sisi);
    }

    @Override
    public void getInfo() {
        System.out.println("Jenis: Segitiga Sama Kaki");
        super.getInfo();
    }

    @Override
    public void hitungLuas() {
        double semiPerimeter = (this.alas + this.sisi + this.sisi) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - this.alas) * (semiPerimeter - this.sisi) * (semiPerimeter - this.sisi)) * 100.0) / 100.0;
        
    }
    
    public void hitungLuas(double alas, double sisi) {
        double semiPerimeter = (alas + sisi + sisi) / 2;
        // System.out.println("s m " + semiPerimeter);
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - alas) * (semiPerimeter - sisi) * (semiPerimeter - sisi)) * 100.0) / 100.0;
        // System.out.println("s - a " + (semiPerimeter - alas));
        // System.out.println("s - s " + (semiPerimeter - sisi));
    }

    @Override
    public void hitungKeliling() {
        super.keliling = this.alas + this.sisi + this.sisi;
    }

    public void hitungKeliling(double alas, double sisi) {
        super.keliling = alas + sisi + sisi;
    }
}