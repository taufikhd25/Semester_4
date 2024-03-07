public class SegitigaSikuSiku extends Segitiga {
    protected double alas;
    protected double tinggi;
    protected double sisiMiring;

    public SegitigaSikuSiku(String name, double sisiMiring, double alas, double tinggi) {
        super.setNama(name);

        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;


        hitungLuas(this.alas, this.tinggi, this.sisiMiring);
        hitungKeliling(this.alas, this.tinggi, this.sisiMiring);
    }

    @Override
    public void getInfo() {
        System.out.println("Jenis: Segitiga Siku Siku");
        super.getInfo();
    }

    @Override
    public void hitungLuas() {
        double semiPerimeter = (this.alas + this.tinggi + this.sisiMiring) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - this.alas) * (semiPerimeter - this.tinggi) * (semiPerimeter - this.sisiMiring)) * 100.0) / 100.0;
    }

    public void hitungLuas(double alas, double tinggi, double sisiMiring) {
        double semiPerimeter = (alas + tinggi + sisiMiring) / 2;
        super.luas = Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - alas) * (semiPerimeter - tinggi) * (semiPerimeter - sisiMiring)) * 100.0) / 100.0;
    }

    @Override 
    public void hitungKeliling() {
        super.keliling = this.alas + this.tinggi + this.sisiMiring;
    }

    public void hitungKeliling(double alas, double tinggi, double sisiMiring) {
        super.keliling = alas + tinggi + sisiMiring;
    }
}