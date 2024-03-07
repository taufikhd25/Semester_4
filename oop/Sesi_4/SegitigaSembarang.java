public class SegitigaSembarang extends Segitiga{
    double alas;
    double sisiB;
    double sisiC;

    public SegitigaSembarang(String name, double alas, double sisiB, double sisiC) {
        super.setNama(name);

        this.alas = alas;
        this.sisiB = sisiB;
        this.sisiC = sisiC;

        hitungLuas();
        hitungKeliling();
    }

    @Override
    public void getInfo() {
        System.out.println("Jenis: Segitiga Sembarang");
        super.getInfo();
    }

    @Override
    public void hitungLuas() {
        double semiPerimeter = (this.alas + this.sisiB + this.sisiC) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - this.alas) * (semiPerimeter - this.sisiB) * (semiPerimeter - this.sisiC)) * 100.0) / 100.0;
    }

    public void hitungLuas(double alas, double sisiB, double sisiC) {
        double semiPerimeter = (alas + sisiB + sisiC) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - alas) * (semiPerimeter - sisiB) * (semiPerimeter - sisiC)) * 100.0) / 100.0;
    }

    @Override 
    public void hitungKeliling() {
        super.keliling = this.alas + this.sisiB + this.sisiC;
    }

    public void hitungKeliling(double alas, double sisiB, double sisiC) {
        super.keliling = alas + sisiB + sisiC;
    }

}
